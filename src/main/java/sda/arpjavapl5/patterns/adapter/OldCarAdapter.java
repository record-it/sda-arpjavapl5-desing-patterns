package sda.arpjavapl5.patterns.adapter;
public class OldCarAdapter implements Drive{
    final OldCar car;

    public OldCarAdapter(OldCar car) {
        this.car = car;
    }

    @Override
    public void drive(double speed, int time) {
        car.setStart(false);
        car.setSpeed(speed);
        car.setStart(true);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        car.setStart(false);
    }
}
