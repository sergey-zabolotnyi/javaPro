package homeWork.extraHomeWork;

import java.util.List;
import java.util.ArrayList;
import lombok.*;

public class Task5 {
    // Создайте класс BookListContainsDemo(Task5) в котором продемонстрируйте как
    // делают проверку есть ли в списке книга или её нет с помощью метода
    // contains(). Если для правильной работы метода contains() требуется
    // внести изменения в класс Book, сделайте это!
    
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);
        System.out.println(books);
        System.out.println("----------");

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        System.out.println(containsBook);
        System.out.println("----------");

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
                // (отрабатывает правильно только после переопределения equals+hash)
        System.out.println(notContainsBook);

    }
}
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
class Books {
    private String title;
    private String author;

}
