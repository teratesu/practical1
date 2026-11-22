package practice07;

public class MathFuncTest {
    public static void main(String[] args) {
        MathCalculable math = new MathFunc();

        System.out.println("2 в степени 10: " + math.power(2, 10));
        System.out.println("Модуль комплексного числа 3 + 4i: " + math.modulus(3, 4));

        MathFunc function = new MathFunc();
        System.out.println("Длина окружности радиуса 5: " + function.circleLength(5));
        System.out.println("Число PI из интерфейса: " + MathCalculable.PI);
    }
}
