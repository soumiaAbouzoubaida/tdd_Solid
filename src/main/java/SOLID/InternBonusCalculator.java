package SOLID;

public class InternBonusCalculator implements BonusCalculator {
    @Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.05;
    }
}
