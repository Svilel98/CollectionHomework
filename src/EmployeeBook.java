import java.util.*;

public class EmployeeBook {
    private final Map<String, Employee> employees = new HashMap<>();
    private int sizeEmployee = 20;
    private final int amountDepartment = 5;

    public void addEmployee(Employee employee) {
        if (sizeEmployee == employees.size()) {
            throw new RuntimeException("Overflow");
        }
        employees.put(employee.getFullName(), employee);
        sizeEmployee++;
    }

    public void removeEmployee(String fullname) {
        Employee employee = employees.remove(fullname);
        if (employee != null) {
            sizeEmployee--;
            System.out.println("Удалил");
        } else {
            throw new RuntimeException("Нет такого");
        }
    }

    public Employee findEmployee(String fullname) {
        return employees.get(fullname);
    }

    public Set<Employee> getSet() {
        return new HashSet<>(employees.values());
    }
}