package practice04;

public class EmployerTest {
    public static void main(String[] args) {
        Employer employer = new Manager("Иван", "Петров", 50000, 15000);
        System.out.println("Ссылка типа Employer на объект Manager:");
        System.out.println(employer + ", годовой доход: " + employer.getIncome());

        Employer[] employees = {
                new Employer("Анна", "Смирнова", 45000),
                new Manager("Олег", "Кузнецов", 60000, 20000),
                new Employer("Мария", "Иванова", 52000)
        };

        System.out.println();
        System.out.println("Доходы сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i] + ": " + employees[i].getIncome());
        }
    }
}
