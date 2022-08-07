package sda.arpjavapl5.patterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class ShapeAndColorBridgeDemo {
    public static void main(String[] args) {
        List<Shape> picture = new ArrayList<>();

        picture.add(new Circle(new Blue()));
        picture.add(new Rectangle(new Red()));
        //dodawanie innych klas wyprowadzonych z Shape dla pozostałyc implemtacji Color

        picture.forEach(s -> System.out.println(s.draw()));

    }
}
