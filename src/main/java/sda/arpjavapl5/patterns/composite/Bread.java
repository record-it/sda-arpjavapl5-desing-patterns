package sda.arpjavapl5.patterns.composite;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bread implements Ingredient{

    double weight;
    double caloriesPerGram;

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
        return 0;
    }
}
