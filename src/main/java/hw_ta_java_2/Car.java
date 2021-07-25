package hw_ta_java_2;

public class Car implements Vehicle,Alarm {

    String brand;
    int speed = 180;

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public int speedUp() {
        return this.speed+10;
    }

    @Override
    public int slowDown() {
        return this.speed-10;
    }
}
