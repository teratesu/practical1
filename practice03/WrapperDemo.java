package practice03;

public class WrapperDemo {
    public static void main(String[] args) {
        Double first = Double.valueOf(3.14);
        Double second = Double.valueOf("2.71");

        double parsed = Double.parseDouble("42.195");

        byte byteValue = first.byteValue();
        short shortValue = first.shortValue();
        int intValue = first.intValue();
        long longValue = first.longValue();
        float floatValue = first.floatValue();
        double doubleValue = first.doubleValue();

        System.out.println("Объект first: " + first);
        System.out.println("Объект second: " + second);
        System.out.println("Строка, преобразованная в double: " + parsed);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        String text = Double.toString(3.14);
        System.out.println("Литерал double, преобразованный в строку: " + text);
    }
}
