package practice02;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(2.5, 3.0);

        System.out.println("Создан мяч: " + ball);
        ball.move(1.5, -0.5);
        System.out.println("После перемещения: " + ball);

        ball.setXY(10.0, 20.0);
        System.out.println("После setXY: " + ball);

        Ball defaultBall = new Ball();
        System.out.println("Мяч по умолчанию: " + defaultBall);
    }
}
