package sda.arpjavapl5.patterns.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BirthDayDiscount implements Discount{
    private static String DISCOUNT_PERCENT = "0.05";
    private final LocalDate birth;
    private final Product product;

    public BirthDayDiscount(LocalDate birth, Product product) {
        this.birth = birth;
        this.product = product;
    }

    @Override
    public BigDecimal discountPrice() {
        LocalDate now = LocalDate.now();
        if (now.getMonth() == birth.getMonth() && now.getDayOfMonth() == birth.getDayOfMonth()){
            return product.getPrice().subtract(product.getPrice().multiply(new BigDecimal(DISCOUNT_PERCENT)));
        }
        return product.getPrice();
    }
}
