package pro.sky;

public class Main {

    public static boolean addEmployee(Employee[] employeesArray, Employee neweployee) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] == null) {
                employeesArray[i] = neweployee;
                return true;
            }
        }
        return false;
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee.toString());
        }
    }

    public static double calculateSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee minSalary(Employee[] employees) {
        Employee result = employees[0];
        double minSalary = employees [0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }public static Employee maxSalary(Employee[] employees) {
        Employee result = employees[0];
        double maxSalary = employees [0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double averageSalary(Employee[] employees) {
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }
        return calculateSalary(employees) / employeeCount;
    }

    public static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }


    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[10];
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] == null) {

                addEmployee(employeeArray, new Employee("Shishkin", "Vasily", "Ivanovich", 1, 10_660));
                addEmployee(employeeArray, new Employee("Zdravkin", "Aleksey", "Sergeevich", 3, 50_000));
                addEmployee(employeeArray, new Employee("Kashin", "Aleksandr", "Aleksandrovich", 4, 60_000));
                addEmployee(employeeArray, new Employee("Strelcov", "Sergey", "Vladimirovich", 1, 10_500));
                addEmployee(employeeArray, new Employee("Iliyn", "Vasily", "Stepanovich", 5, 12_648));
                addEmployee(employeeArray, new Employee("Shevchuck", "Viktor", "Andreevich", 1, 17_500));
                addEmployee(employeeArray, new Employee("Sabakin", "Michail", "Kirilovich", 3, 19_600));
                addEmployee(employeeArray, new Employee("Timofeeva", "Katia", "Vasilieva", 1, 80_080));
                addEmployee(employeeArray, new Employee("Shonova", "lydmila", "Michaylovna", 4, 65_200));
                addEmployee(employeeArray, new Employee("Vontova", "Larisa", "Ivanovna", 5, 8_015));
            }
        }
        printEmployees(employeeArray);
        System.out.println("Месячные выплаты зарплаты сотрудникам - " + calculateSalary(employeeArray) + " руб.");
        System.out.println("минимальная месячная зарпалта - " + minSalary(employeeArray) + " руб.");
        System.out.println("максимальная месячная зарпалта - " + maxSalary(employeeArray) + " руб.");
        System.out.println("средня месячная зарплата - " + averageSalary(employeeArray) + " руб.");
        printFullName(employeeArray);
    }
}
