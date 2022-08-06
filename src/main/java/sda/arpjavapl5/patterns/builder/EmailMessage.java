package sda.arpjavapl5.patterns.builder;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class EmailMessage {
    List<String> to;
    @Singular("addCC")
    List<String> cc;
    List<String> bcc;
    String subject;
    String content;
}
