package Cars;

public class Car {
    private String brand;
    private Engine engine;
    private Battery battery;

    public Car(String brand, Engine engine, Battery battery) {
        this.brand = brand;
        this.engine = engine;
        this.battery = battery;
    }
    public String getBrand() {
        return brand;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Battery getBattery() {
        return battery;
    }
    public void setBattery(Battery battery) {
        this.battery = battery;
    }
    @Override
    public String toString() {
        return "Car:" +
                "brand= '" + brand + "', engine= '" + engine + "', battery= '" + battery + "'";
    }
}