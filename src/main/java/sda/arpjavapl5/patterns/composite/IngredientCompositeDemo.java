package sda.arpjavapl5.patterns.composite;

public class IngredientCompositeDemo {
    public static void main(String[] args) {
        Sandwich sandwich = Sandwich.builder()
                .add(Chesse.builder()
                        .sugarPerGram(1)
                        .caloriesPerGram(5)
                        .weight(10)
                        .name("gouda")
                        .build())
                .add(Bread.builder()
                        .caloriesPerGram(2)
                        .weight(100)
                        .build())
                .build();
        Ingredient menu = Dish.builder()
                .add(sandwich)
                .add(Bread.builder().build())
                .build();

    }
}
