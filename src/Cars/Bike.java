package Cars;
public class Bike extends Car {
    private final String model;
    private final String typeTrunk;

    public Bike(String brand, String model, Engine engine, Battery battery, String typeTrunk) {
        super(brand, engine, battery);
        this.model = model;
        this.typeTrunk = typeTrunk;
    }
    public String getModel() {
        return model;
    }
    public String getTypeTrunk() {
        return typeTrunk;
    }

}