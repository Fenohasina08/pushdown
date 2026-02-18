import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataRetriever retriever = new DataRetriever();
        List<InvoiceTotal> totals = retriever.findInvoiceTotals();

        System.out.println("Q1 - Total par facture :");
        totals.forEach(System.out::println);

        System.out.println("\n=== Q2 ===");
        retriever.findConfirmedAndPaidInvoiceTotals().forEach(System.out::println);
    }
}
