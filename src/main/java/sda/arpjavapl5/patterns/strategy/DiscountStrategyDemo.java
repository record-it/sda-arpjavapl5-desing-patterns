package sda.arpjavapl5.patterns.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DiscountStrategyDemo {
    public static void main(String[] args) {
        Product laptop = Product.builder()
                .price(new BigDecimal("2500.0"))
                .name("Laptop")
                .build();
        Product paper = Product.builder()
                .price(new BigDecimal("25.50"))
                .name("Polspeed")
                .build();
        Product mouse = Product.builder()
                .price(new BigDecimal("39.99"))
                .name("Mysz przewodowa")
                .build();
        Order order = new Order();
        order.getItems().put(laptop, 1);
        order.getItems().put(paper, 5);
        order.getItems().put(mouse, 2);

        List<Discount> orderDiscounts = new ArrayList<>();
        orderDiscounts.add(new BirthDayDiscount(LocalDate.of(2000, 8,21), laptop));
        orderDiscounts.add(() -> paper.getPrice().multiply(new BigDecimal("0.98")));
        orderDiscounts.add(mouse::getPrice);

        BigDecimal totalPriceAfterDiscount =
                orderDiscounts.stream().map(Discount::discountPrice).reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalPriceAfterDiscount);
    }
}
