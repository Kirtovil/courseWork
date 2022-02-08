package pro.sky;

import java.util.Objects;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private int department;
    private double salary;
    private static int counter = 1;

    public Employee(String lastName, String firstName, String middleName, int department, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = counter++;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId (){
        return id;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(employee.salary, salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, department, salary);
    }

    @Override
    public String toString() {
        return "сотрудник{" +
                "id-" + id +
                ", фамилия-'" + lastName + '\'' +
                ", имя-'" + firstName + '\'' +
                ", отчество-'" + middleName + '\'' +
                ", отдел-" + department +
                ", зарплата-" + salary +
                '}';
    }


}
