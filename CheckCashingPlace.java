package company;

public class CheckCashingPlace {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        HireDate hireDate = new HireDate(9,21,2021);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike", hireDate);
        employees[0] = hourlyEmployee;
        SalariedEmployee salariedEmployee = new SalariedEmployee("James", hireDate);
        employees[1] = salariedEmployee;
        Hr.issueBadge(employees);
        Entrepreneur entrepreneur = new Entrepreneur("Cece");
        IPay[] payablePpl = {hourlyEmployee,salariedEmployee, entrepreneur};
        Hr.payPerson(payablePpl);
    }
}
