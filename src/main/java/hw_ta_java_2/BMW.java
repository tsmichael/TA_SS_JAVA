package hw_ta_java_2;

public class BMW extends Car {

    String model;

    BMW() {
        super();
    }

    @Override
    public String getBrand() {
        if (this.brand.isEmpty()) {
            return this.getClass().getName();
        } else {
            return this.brand;
        }
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
