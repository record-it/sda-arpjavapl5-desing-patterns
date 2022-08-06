package sda.arpjavapl5.patterns.factory_method;

import lombok.*;

@Builder
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class EmailMessage extends Message{
    String to;
    String from;
    @Builder(builderMethodName = "messageBuilder")
    public EmailMessage(String content, String to, String from){
        super(content);
        this.from = from;
        this.to = to;
    }
}
