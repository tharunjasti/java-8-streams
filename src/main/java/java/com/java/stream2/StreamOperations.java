package java.com.java.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperations {
    static  class Book{
        private long isbn;
        private String title;
        private double rating;
        private double price;
        private String source;
        public Book(long isbn, String title, double rating, double price, String source) {
            this.isbn = isbn;
            this.title = title;
            this.rating = rating;
            this.price = price;
            this.source = source;
        }

        public long getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public double getRating() {
            return rating;
        }

        public double getPrice() {
            return price;
        }

        public String getSource() {
            return source;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return isbn == book.isbn;
        }

        @Override
        public int hashCode() {

            return Objects.hash(isbn);
        }

        @Override
        public String toString() {
            return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", source="
                    + source + "]";
        }

    }

    private static void slice(List<Book> books){
        System.out.println("\n Slice....");
        List<String >result=books.stream()
                .filter(b -> b.getPrice() >= 4.5)
                .distinct()
             //   .peek(b -> System.out.println(b.getTitle()+" "+b.getRating()))
               .limit(5)
              //  .skip(5)
                .map(b -> b.getTitle())
              //  .forEach(System.out::println);
                .collect(Collectors.toList());

        result.forEach(s -> System.out.println("title::"+s));

    }

    private static  void match(List<Book> books){
        System.out.println("Match method");
        boolean anyMatch = books.stream()
                .anyMatch(d -> d.getRating() >= 4.8 && d.getPrice() <= 50.0);
        System.out.println(anyMatch);

        boolean allMatch = books.stream().allMatch(d -> d.getRating() >= 4.8 && d.getPrice() <= 50.0);
        System.out.println(allMatch);

        boolean noneMatch = books.stream().noneMatch(d -> d.getRating() <= 2.0);
        System.out.println(noneMatch);
    }

    private static void find(List<Book> books){
        System.out.println("\n Finding.....");
        Optional<Book> book = books.stream()
                .filter(d -> d.getRating() >= 4.8 && d.getPrice() <= 50.0)
                .findAny();  //.orElse(StreamOperations.getDefault());
        if (book.isPresent()){
            System.out.println(book.get());
        }
    }

    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.addAll(DataExtractor.getFromAmazon("java"));
        books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
       // slice(books);
       // match(books);
        find(books);

    }
    public static Book getDefault(){
        System.out.println("default book ");
        return new Book(0," ",4.0,2.5,"amazon");
    }
}

