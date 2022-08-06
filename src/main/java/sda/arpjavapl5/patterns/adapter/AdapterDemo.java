package sda.arpjavapl5.patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        OldCar car = new OldCar();
        OldCarAdapter carAdapter = new OldCarAdapter(car);
        CarDriver driver = new CarDriver(carAdapter);
        driver.travel();
    }
}
