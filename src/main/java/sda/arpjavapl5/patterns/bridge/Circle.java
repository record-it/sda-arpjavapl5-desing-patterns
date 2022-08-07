package sda.arpjavapl5.patterns.bridge;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    String draw() {
        return "Circle is drawn with color: " + color.fill();
    }
}
