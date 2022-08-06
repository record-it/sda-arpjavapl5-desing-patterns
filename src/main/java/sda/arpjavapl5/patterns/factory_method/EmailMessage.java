package sda.arpjavapl5.patterns.factory_method;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EmailMessage extends Message{
    String to;
    String from;
}
