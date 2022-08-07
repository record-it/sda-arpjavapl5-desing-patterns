package sda.arpjavapl5.patterns.bridge;

public abstract class Shape {
    final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract String draw();
}
