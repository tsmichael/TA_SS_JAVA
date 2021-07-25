package hw_ta_java_2;

public class BMW extends Car {

    String model;

    BMW() {
        super();
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return "{---BMW---}" +
                "\nmodel='" + model + '\'' +
                "\nbrand='" + brand + '\'';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
