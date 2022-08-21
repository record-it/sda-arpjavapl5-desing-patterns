package sda.arpjavapl5.patterns.strategy;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Product {
    private BigDecimal price;
    private String name;
}
