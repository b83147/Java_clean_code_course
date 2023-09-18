package Cars;

public class Truck extends Car {
    private final String model;
    private final String typeVan;

    public Truck(String brand, String model, Engine engine, Battery battery, String typeVan) {
        super(brand, engine, battery);
        this.model = model;
        this.typeVan = typeVan;
    }
    public String getModel() {
        return model;
    }
    public String getTypeVan() {
        return typeVan;
    }

}
