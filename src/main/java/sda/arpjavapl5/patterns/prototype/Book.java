package sda.arpjavapl5.patterns.prototype;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book implements BookClonable{
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
    protected Object clone() throws CloneNotSupportedException {
        return Book.builder()
                .author(this.author)
                .title(this.title)
                .id(this.id)
                .build();
    }
}
