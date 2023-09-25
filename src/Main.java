public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(
                new Employee("Андрей", "Круглов", "Алексеевич", 1, 1500
                ));
        employeeBook.addEmployee(
                new Employee("Артем", "Секретарев", "Вячеславовичч", 1, 11
                ));
        employeeBook.addEmployee(new Employee("Олег", "Гришаев", "Владимирович", 2, 125
        ));
        employeeBook.addEmployee(new Employee(
                "Иван", "Феофанов", "Сергеевич", 3, 10000
        ));
        employeeBook.addEmployee(
                new Employee("Максим", "Трапезников", "Сергеевич", 5, 1000000
                ));
        employeeBook.addEmployee(
                new Employee("Степан", "Борисов", "Батькович", 1, 17000
                ));
        employeeBook.addEmployee(
                new Employee("Даниил", "Викторов", "Алексеевич", 1, 30000
                ));
        employeeBook.addEmployee(
                new Employee("Андрей", "Бутурлакин", "Александрович", 2, 14
                ));
        employeeBook.addEmployee(
                new Employee("Михаил", "Глаголев", "Денисович", 5, 111
                ));
        employeeBook.addEmployee(
                new Employee("Александр", "Гердт", "Александрович", 2, 111
                ));
        employeeBook.removeEmployee(
                "Гердт Александр Александрович"
        );
        employeeBook.findEmployee(
                "Глаголев Михаил Денисович"
        );
        employeeBook.getSet();
    }
}