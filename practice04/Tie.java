package practice04;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String getType() {
        return "Галстук";
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел: " + this);
    }
}
