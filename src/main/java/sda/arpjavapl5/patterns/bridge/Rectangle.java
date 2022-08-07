package sda.arpjavapl5.patterns.bridge;

public class Rectangle extends Shape{

    protected Rectangle(Color color) {
        super(color);
    }

    @Override
    String draw() {
        return "Rectangle is drawn with color: " + color.fill();
    }
}
