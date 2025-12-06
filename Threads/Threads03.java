package Threads;

import java.util.List;

public record Book(String title, int price, String author){}
public class Threads03 {
    public static void main(String[] args){
        List<Book> books = List.of(
            new Book("Java Programming", 750, "James Gosling"),
            new Book("C Fundamentals", 450, "Dennis Ritchie"),
            new Book("Database Systems", 900, "Ramakrishnan")
        );
        books.stream().filter(b->b.price() > 500)
        .forEach(b -> {                        // lambda for printing
         System.out.println("Title: " + b.title());
         System.out.println("Author: " + b.author());
         System.out.println("Price: " + b.price());
         System.out.println();});
        
    }

}
