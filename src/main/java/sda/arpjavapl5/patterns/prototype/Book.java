package sda.arpjavapl5.patterns.prototype;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book implements BookClonable, Cloneable<Book>{
    String author;
    String title;
    String id;

    @Override
    public Book cloneWithId(String id) {
        return Book.builder()
                .author(this.author)
                .title(this.title)
                .id(id)
                .build();
    }

    @Override
    public Book clone() {
        return Book.builder()
                .author(this.author)
                .title(this.title)
                .id(this.id)
                .build();
    }
}
