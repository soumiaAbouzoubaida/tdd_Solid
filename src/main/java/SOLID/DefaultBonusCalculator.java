package SOLID;

public class DefaultBonusCalculator implements BonusCalculator {
    @Override
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.03;
    }
}


