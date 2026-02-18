import java.util.ArrayList;
import java.util.List;
public class DataRetriever {
    private final String url = "jdbc:postgresql://localhost:5432/pushdown";
    private final String user = "postgres";
    private final String password = "fenohasina3123";

    public List<InvoiceTotal> findInvoiceTotals () {
        List<InvoiceTotal> result = new ArrayList<>();
        String sql = """
                      SELECT id, customer_name, status, SUM(quantity * unit_price) AS total FROM invoice
                                  JOIN invoice_line ON invoice.id = invoice_line.invoice_id
                                        GROUP BY id, customer_name, status
                                                ORDER BY id
                
                """
    }
}
