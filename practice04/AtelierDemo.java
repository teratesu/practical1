package practice04;

public class AtelierDemo {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "белый"),
                new Pants(Size.L, 3200, "черный"),
                new Skirt(Size.S, 2800, "синий"),
                new Tie(Size.XS, 900, "бордовый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}
