package practice04;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String getType() {
        return "Юбка";
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела: " + this);
    }
}
