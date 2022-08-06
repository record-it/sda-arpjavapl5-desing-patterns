package sda.arpjavapl5.patterns.facade;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
class Transaction {
    Account source;
    Account target;
    BigDecimal amount;
    LocalDateTime timestamp;
}
