import java.util.List;

public class Main {
    public static void main(String[] args) {
        InvoiceDAO dao = new InvoiceDAO();


        List<InvoiceTotal> totals = dao.findInvoiceTotals();
        System.out.println("findInvoiceTotals() :");
        for (InvoiceTotal it : totals) {
            System.out.println(it);
        }


        List<InvoiceTotal> confirmedPaid = dao.findConfirmedAndPaidInvoiceTotals();
        System.out.println("\nfindConfirmedAndPaidInvoiceTotals() :");
        for (InvoiceTotal it : confirmedPaid) {
            System.out.println(it.getId() + " | " + it.getCustomerName() + " | " + it.getStatus() + " | " + it.getTotal());
        }

         InvoiceStatusTotals totalsByStatus = dao.computeStatusTotals();
        System.out.println("\ncomputeStatusTotals() :");
        System.out.println(totalsByStatus);

        Double weighted = dao.computeWeightedTurnover();
        System.out.println("\ncomputeWeightedTurnover() :");
        System.out.printf("%.2f%n", weighted);
    }
}