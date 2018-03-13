import db.DBHelper;
import models.Author;
import models.Book;


import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Author author1 = new Author("Milan Kundera");
        DBHelper.save(author1);

        Author author2 = new Author("Marian Keyes");
        DBHelper.save(author2);

        Book book1 = new Book("Watermelon", author2);
        DBHelper.save(book1);

        Book book2 = new Book("The Unbearable Lightness of Being", author1);
        DBHelper.save(book2);
    }

    List<Book> books = DBHelper.getAll("Book");

    List<Author> authors = DBHelper.getAll("Author");


}
