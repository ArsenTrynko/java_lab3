package ua.lviv.iot.WaterTransport.model;

public class MotorShip extends WaterTransport {
    private String fuelType;

    public MotorShip() {

    }

    public MotorShip(int transportCapacity, int transportMaxSpeed, double transportConsuption, String fuelType) {
        super(transportCapacity, transportMaxSpeed, transportConsuption);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "MotorShip{"
                +
                "FuelType='"
                + fuelType + '\''
                +
                '}';
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        fuelType = fuelType;
    }
}
