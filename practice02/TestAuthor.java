package practice02;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иван Петров", "ivan@mail.ru", 'm');

        System.out.println(author);
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("petrov@example.com");
        System.out.println("После изменения email: " + author);
    }
}
