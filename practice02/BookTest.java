package practice02;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(10);

        shelf.addBook(new Book("Л. Н. Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Ф. М. Достоевский", "Преступление и наказание", 1866));
        shelf.addBook(new Book("А. С. Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("М. А. Булгаков", "Мастер и Маргарита", 1967));

        System.out.println("Книги на полке:");
        shelf.printBooks();

        System.out.println();
        System.out.println("Самая поздняя книга: " + shelf.getLatestBook());
        System.out.println("Самая ранняя книга: " + shelf.getEarliestBook());

        shelf.sortByYear();
        System.out.println();
        System.out.println("Книги после сортировки по году:");
        shelf.printBooks();
    }
}
