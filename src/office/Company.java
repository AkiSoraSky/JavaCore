package office;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {
        Department accounts = new Department("Accounts", "Account related works", 0);
        Department sales = new Department("Sales", "Handles sale related works", 0);

        Employee e1 = new Employee("Golu", "Hazratganj", sales, "Manager", "S001");
        Employee e2 = new Employee("Molu", "Gomtinagar", sales, "Asst. Manager", "AM001");
        Employee e3 = new Employee("Cholu", "Kanpur", sales, "Associate", "A001");

        sales.totalEmployee = 3;

        Employee e4 = new Employee("Tolu", "Gomtinagar", accounts, "Manager", "M002");
        Employee e5 = new Employee("Lolu", "Kanpur", accounts, "Asst. Manager", "AM002");
        Employee e6 = new Employee("kolu", "Kanpur", accounts, "Associate", "A002");

        accounts.totalEmployee = 3;

        sales.show();
        for (Employee employee : Arrays.asList(e1, e2, e3)) {
            employee.show();
        }
        accounts.show();
        for (Employee employee : Arrays.asList(e4, e5, e6)) {
            employee.show();
        }
    }
}
