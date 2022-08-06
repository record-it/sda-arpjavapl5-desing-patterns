package sda.arpjavapl5.patterns.adapter;

public class CarDriver {
    final Drive drivenCar;

    public CarDriver(Drive drivenCar) {
        this.drivenCar = drivenCar;
    }

    public void travel(){
        drivenCar.drive(100, 2);
        drivenCar.drive(50, 5);
    }
}
