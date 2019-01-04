package comparator_lambda;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);
        Comparator<Employee> nameLength = Comparator.comparingInt(employee -> employee.getName().length());
        Set<Employee> employees = new TreeSet<>(salaryComparator.thenComparing(nameLength));
        employees.add(new Employee(1, "John", 25, 2500));
        employees.add(new Employee(2, "Dan", 27, 1200));
        employees.add(new Employee(3, "Alan", 22, 1400));
        employees.add(new Employee(4, "Alice", 29, 2500));
        System.out.println(employees);
    }
}
