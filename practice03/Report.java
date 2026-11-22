package practice03;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-25s%15s%n", "Сотрудник", "Зарплата");
        System.out.println("------------------------------------");

        double total = 0;

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-25s%15.2f%n", employees[i].getFullName(), employees[i].getSalary());
            total += employees[i].getSalary();
        }

        System.out.println("------------------------------------");
        System.out.printf("%-25s%15.2f%n", "Итого", total);
    }
}
