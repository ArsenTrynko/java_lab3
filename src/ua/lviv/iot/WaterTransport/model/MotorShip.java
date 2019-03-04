package ua.lviv.iot.WaterTransport.model;

public class MotorShip extends WaterTransport {
    private String FuelType;

    public MotorShip(){

    }

    public MotorShip(int transportCapacity,int transportMaxSpeed,double transportConsuption,String fuelType){
        super(transportCapacity, transportMaxSpeed, transportConsuption);
        this.FuelType=fuelType;
    }

    @Override
    public String toString() {
        return "MotorShip{" +
                "FuelType='" + FuelType + '\'' +
                '}';
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }
}
