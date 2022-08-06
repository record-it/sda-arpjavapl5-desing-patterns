package sda.arpjavapl5.patterns.adapter;
public class OldCarAdapter implements Drive{
    final OldCar car;

    public OldCarAdapter(OldCar car) {
        this.car = car;
    }

    @Override
    public void drive(double speed, int time) {
        car.start = false;
        car.speed = speed;
        car.start = true;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        car.start = false;
    }
}
