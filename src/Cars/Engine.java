package Cars;

public abstract class Engine {
    private final String manufacturer;
    private final String type;
    private int power;
    private int maxSpeed;

    public Engine(String manufacturer, String type, int power, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }
    public String getManufacturer() {
                return manufacturer;
    }
    public String getType() {
                return type;
    }
    public int getPower() {
                return power;
    }
    public void setPower(int power) {
                this.power = power;
    }
    public int getMaxSpeed() {
                return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
                this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Engine: " +
                "manufacturer= '" + this.manufacturer + "', type= '" + this.type + "', power= '" + this.power + "', maxSpeed= '" + this.maxSpeed + "'";
    }
}