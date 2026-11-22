package practice02;

public class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int size) {
        dogs = new Dog[size];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        } else {
            System.out.println("В питомнике нет свободных мест.");
        }
    }

    public void printAllDogs() {
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(5);

        kennel.addDog(new Dog("Рекс", 3));
        kennel.addDog(new Dog("Бим", 5));
        kennel.addDog(new Dog("Найда", 2));

        System.out.println("Собаки в питомнике:");
        kennel.printAllDogs();
    }
}
