import java.util.*;

public class EmployeeBook {
    private final Map<String, Employee> employees = new HashMap<>();
    private int sizeEmployee = 20;
    private final int amountDepartment = 5;

    public void addEmployee(Employee employee) {
        if (sizeEmployee <= employees.size()) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
            System.out.println();
        }
        employees.put(employee.getFullName(), employee);
        sizeEmployee++;
    }

    public void removeEmployee(String fullname) {
        Employee employee = employees.get(fullname);
        if (employee != null) {
            employees.remove(fullname);
            sizeEmployee--;
            System.out.println("Удалил");
        }
        System.out.println("____");
    }

    public void findEmployee(String fullname) {
        boolean employee = employees.containsKey(fullname);
        if (employee) {
            System.out.println(("Найден " + employees.get(fullname)));
        }
        System.out.println("Нет такого");
    }
    public Set<Employee> getSet(){
        return new HashSet<>(employees.values());
    }
}