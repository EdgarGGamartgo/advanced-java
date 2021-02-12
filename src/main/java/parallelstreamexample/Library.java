package parallelstreamexample;

import java.util.ArrayList;

public class Library {
    
    public static void main(String[] args) {

        ArrayList<Book> books = populateLibrary();
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).forEach(System.out::println);
    }
    
    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        return books;
    }
}
