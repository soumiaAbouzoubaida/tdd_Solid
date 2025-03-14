package SOLID;

public class Employee {
    private final String name;
    private final double salary;
    private final String department;
    private String address;
    private String phoneNumber;

    public Employee(String name, double salary, String department, String address, String phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Updated address to: " + newAddress);
    }

    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
        System.out.println("Updated phone number to: " + newPhoneNumber);
    }

    public void conductMeeting(String topic) {
        System.out.println("Conducting meeting on: " + topic);
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
    }
}