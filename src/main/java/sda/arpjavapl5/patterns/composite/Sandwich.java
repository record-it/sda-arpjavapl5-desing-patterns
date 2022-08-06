package sda.arpjavapl5.patterns.composite;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Sandwich implements Ingredient{
    @Singular("add")
    List<Ingredient> ingredients;
    @Override
    public double calories() {
        return ingredients.stream().mapToDouble(Ingredient::calories).sum();
    }

    @Override
    public double weight() {
        return ingredients.stream().mapToDouble(Ingredient::weight).sum();
    }

    @Override
    public double sugar() {
        return ingredients.stream().mapToDouble(Ingredient::sugar).sum();
    }
}
