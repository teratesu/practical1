package practice04;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomenClothing) {
                WomenClothing item = (WomenClothing) clothes[i];
                item.dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof MenClothing) {
                MenClothing item = (MenClothing) clothes[i];
                item.dressMan();
            }
        }
    }
}
