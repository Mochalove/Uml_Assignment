package company;

public abstract class Employee extends Person{

    public HireDate hireDate;

    public Employee(String name, HireDate hiredate) {
        super(name);
        this.hireDate = hiredate;
    }


    public Employee(String name) {
        super(name);
        this.hireDate = hireDate;
    }
}
