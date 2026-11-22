package practice07;

public class ProcessStringsTest {
    public static void main(String[] args) {
        StringOperations operations = new ProcessStrings();
        String text = "Программирование";

        System.out.println("Исходная строка: " + text);
        System.out.println("Количество символов: " + operations.countChars(text));
        System.out.println("Символы на нечетных позициях: " + operations.oddChars(text));
        System.out.println("Инвертированная строка: " + operations.reverse(text));
    }
}
