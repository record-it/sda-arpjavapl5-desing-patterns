package sda.arpjavapl5.patterns.composite;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Chesse implements Ingredient{
    String name;
    double caloriesPerGram;
    double weight;
    double sugarPerGram;


    @Override
    public double calories() {
        return weight * caloriesPerGram;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double sugar() {
        return weight * sugarPerGram;
    }
}
