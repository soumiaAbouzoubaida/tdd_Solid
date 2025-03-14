package SOLID;

public class ReportService implements ReportGenerator {
    @Override
    public void generateReport(String format) {
        if ("PDF".equals(format)) {
            System.out.println("Generating PDF Report...");
        } else if ("HTML".equals(format)) {
            System.out.println("Generating HTML Report...");
        } else {
            System.out.println("Unsupported report format");
        }
    }

    public void sendReport(String email) {
        System.out.println("Sending report to: " + email);
    }
}