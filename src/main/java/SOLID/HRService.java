package SOLID;

public class HRService {
    public void requestLeave(Employee employee, int days) {
        System.out.println(employee.getName() + " requested " + days + " days of leave.");
    }

    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for " + employeeName);
    }

    public void rejectLeave(String employeeName) {
        System.out.println("Leave rejected for " + employeeName);
    }

    public void evaluatePerformance(String employeeName, String performance) {
        System.out.println("Performance of " + employeeName + " is: " + performance);
    }

    public void scheduleInterview(String candidateName) {
        System.out.println("Scheduled interview with " + candidateName);
    }
}