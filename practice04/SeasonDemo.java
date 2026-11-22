package practice04;

public class SeasonDemo {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;

        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature());
        System.out.println("Описание: " + favorite.getDescription());

        printSeasonMessage(favorite);

        System.out.println();
        System.out.println("Все времена года:");
        for (Season season : Season.values()) {
            System.out.println(season + ": средняя температура " + season.getAverageTemperature()
                    + ", " + season.getDescription());
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
