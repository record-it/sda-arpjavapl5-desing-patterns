package sda.arpjavapl5.patterns.strategy;

import java.math.BigDecimal;

public class TotalDiscount implements Discount{
    private static String LIMIT = "1000.00";
    private static String DISCOUNT_PERCENT = "0.02";
    private final Order order;

    public TotalDiscount(Order order) {
        this.order = order;
    }

    @Override
    public BigDecimal discountPrice() {
        if (order.price().compareTo(new BigDecimal(LIMIT)) >= 0){
            return order.price().subtract(order.price().multiply(new BigDecimal(DISCOUNT_PERCENT)));
        }
        return order.price();
    }
}
