package sda.arpjavapl5.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookGenerator {
    public List<Book> generate(String title, String author, int count) {
        List<Book> books = new ArrayList<>();
        final BookDetails bookDetails = BookDetails.builder()
                .author(author)
                .title(title)
                .build();
        for (int i = 0; i < count; i++) {
            UUID uuid = UUID.randomUUID();
            books.add(
                    Book.builder()
                            .details(bookDetails)
                            .id(uuid.toString())
                            .build()
            );
        }
        return books;
    }
}
