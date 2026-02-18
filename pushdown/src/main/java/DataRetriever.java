import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    private final String url = "jdbc:postgresql://localhost:5432/pushdown";
    private final String user = "postgres";
    private final String password = "fenohasina3123";

    public List<InvoiceTotal> findInvoiceTotals() {
        List<InvoiceTotal> result = new ArrayList<>();
        String sql = """
    SELECT invoice.id, invoice.customer_name, invoice.status, SUM(quantity * unit_price) AS total 
    FROM invoice
    JOIN invoice_line ON invoice.id = invoice_line.invoice_id
    GROUP BY invoice.id, invoice.customer_name, invoice.status
    ORDER BY invoice.id
""";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                InvoiceTotal total = new InvoiceTotal(
                        rs.getInt("id"),
                        rs.getString("customer_name"),
                        InvoiceStatus.valueOf(rs.getString("status")),
                        rs.getDouble("total")
                );
                result.add(total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<InvoiceTotal> findConfirmedAndPaidInvoiceTotals() {
        List<InvoiceTotal> result = new ArrayList<>();
        String sql = """
            SELECT invoice.id, customer_name, status, SUM(quantity * unit_price) AS total 
            FROM invoice
            JOIN invoice_line ON invoice.id = invoice_line.invoice_id
            WHERE status IN ('CONFIRMED', 'PAID')
            GROUP BY invoice.id, customer_name, status
            ORDER BY invoice.id
            """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                InvoiceTotal total = new InvoiceTotal(
                        rs.getInt("id"),
                        rs.getString("customer_name"),
                        InvoiceStatus.valueOf(rs.getString("status")),
                        rs.getDouble("total")
                );
                result.add(total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
