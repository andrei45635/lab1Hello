class Employee{
    int Age, Salary;
    String Position, Name;

    public Employee(String empName){
        this.Name = empName;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setPosition(String position) {
        this.Position = position;
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
    }
}
