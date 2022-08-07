package sda.arpjavapl5.patterns.flyweight;

public class BookFlyweightDemo {
    public static void main(String[] args) {
        BookGenerator generator = new BookGenerator();
        System.out.println(generator.generate(
                "Java",
                "Bloch",
                10
        ));
    }
}
