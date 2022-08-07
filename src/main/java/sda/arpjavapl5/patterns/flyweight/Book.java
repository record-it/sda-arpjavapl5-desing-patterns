package sda.arpjavapl5.patterns.flyweight;

import lombok.Builder;
import lombok.Data;

/**
 * Klasa reprezentuje egzemplarz książki w bibliotece
 */
@Data
@Builder
public class Book {
    BookDetails details;
    //nr katalogowy
    String id;
}
