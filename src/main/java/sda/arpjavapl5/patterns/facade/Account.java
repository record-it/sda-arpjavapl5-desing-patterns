package sda.arpjavapl5.patterns.facade;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
class Account {
    String name;
    String pesel;
    BigDecimal balance;
    int id;
}
