package sda.arpjavapl5.patterns.flyweight;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDetails {
    String title;
    String author;
}
