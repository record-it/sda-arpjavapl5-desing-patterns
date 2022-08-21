package sda.arpjavapl5.patterns.strategy;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
public class Order {
    private Map<Product, Integer> items = new HashMap<>();

    public BigDecimal price(){
        return items.entrySet().stream()
                .map(entry -> entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue())))
                .reduce(BigDecimal.ZERO, (a, p) -> a.add(p));
    }
}
