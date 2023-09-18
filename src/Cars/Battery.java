package Cars;
    public class Battery {
        private final String manufacturer;
        private int capacity;
        private int voltage;

        public Battery(String manufacturer, int capacity, int voltage) {
            this.manufacturer = manufacturer;
            this.capacity = capacity;
            this.voltage = voltage;
        }

        public String getManufacturer() {
            return manufacturer;
        }
        public int getCapacity() {
            return capacity;
        }
        public int getVoltage() {
            return voltage;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
        public void setVoltage(int voltage) {
            this.voltage = voltage;
        }
        @Override
        public String toString() {
            return "Battery: " +
                    "manufacturer= '" + this.manufacturer + "', capacity= '" + this.capacity + "', voltage= '" + this.voltage + "'";
                    }
        }