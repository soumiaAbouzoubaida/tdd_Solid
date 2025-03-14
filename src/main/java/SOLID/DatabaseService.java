package SOLID;

public class DatabaseService implements IDatabaseService {
    @Override
    public void connect() {
        System.out.println("Connecting to database...");
    }

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("Saving employee " + employee.getName() + " data into database...");
    }
}