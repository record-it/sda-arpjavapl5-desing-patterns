package sda.arpjavapl5.patterns.factory_method;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class SMSMessage extends Message{
    String phoneNumber;

    @Builder(builderMethodName = "messageBuilder")
    public SMSMessage(String phoneNumber, String content) {
        super(content);
        this.phoneNumber = phoneNumber;
    }
}
