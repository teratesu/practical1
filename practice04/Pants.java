package practice04;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String getType() {
        return "Штаны";
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела: " + this);
    }
}
