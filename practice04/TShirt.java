package practice04;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String getType() {
        return "Футболка";
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
