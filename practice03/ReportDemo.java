package practice03;

public class ReportDemo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 85000.5),
                new Employee("Петрова Мария Сергеевна", 92000.75),
                new Employee("Сидоров Алексей Петрович", 78000.0),
                new Employee("Козлова Анна Викторовна", 101500.25)
        };

        Report.generateReport(employees);
    }
}
