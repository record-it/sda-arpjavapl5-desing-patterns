package sda.arpjavapl5.patterns.builder;

public class BookBuilderDemo {
    public static void main(String[] args) {
        Book book = Book.builder()
                .title("Java")
                .author("Bloch")
                .build();
        Book emptyBook = Book.builder().title("Spring").author("Freeman").releaseYear(2011).build();
        System.out.println(book);
        System.out.println(emptyBook);

    }
}
