class Employee{
    int Age, Salary;
    String Position, Name;

    public Employee(String empName){
        this.Name = empName;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getSalary(){
        return (Salary);
    }
    public void showEmployee(){
        System.out.println("Employee " + Name + " has a salary of " + Salary + " is a " + Position + " and is " + Age + " years old");
    }
}

class Manager extends Employee{
    public Manager(String empName) {
        super("Manager " + empName);
    }
    public void setManagerSalary(int bonus){
        Salary = this.getSalary() + bonus;
    }
    public void showSalaryManager(){
        System.out.println("The manager's salary after the bonus is: " + Salary);
    }
}

public class smallManagement {
    public static void main(String[] args){
        Employee emp1 = new Employee("Nicolae Soldab");
        Employee emp2 = new Employee("Festa Robert");
        emp1.setAge(19);
        emp1.setPosition("Director");
        emp1.setSalary(9999);
        emp2.setAge(18);
        emp2.setPosition("VP");
        emp2.setSalary(9999);
        emp1.showEmployee();
        emp2.showEmployee();
        Manager m1 = new Manager("Sandu Bogdan");
        m1.setSalary(25);
        m1.setManagerSalary(5);
        m1.showSalaryManager();
        m1.showEmployee();
    }
}
