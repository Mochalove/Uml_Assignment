package company;

public class SalariedEmployee extends Employee implements IPay{
    private Double salary;

    public SalariedEmployee(String name, HireDate hireDare) {
        super(name, hireDare);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Double calcPay() {
        return null;
    }
    @Override
    public void pay(){
//        System.out.println(this.hourlyWage * this.hoursWorked);
    }
}
