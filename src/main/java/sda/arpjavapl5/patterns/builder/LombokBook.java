package sda.arpjavapl5.patterns.builder;

import lombok.*;

@Builder
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LombokBook {
    @NonNull
    final String title;
    @Builder.Default
    final String author = "autor nieznany";
    final String isbn;
    @Builder.Default
    final String description = "brak opisu";
    @Builder.Default
    final int releaseYear = -1;
}
