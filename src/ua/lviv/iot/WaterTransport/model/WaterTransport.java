package ua.lviv.iot.WaterTransport.model;

public class WaterTransport {
    private int transportCapacity ;
    private int transportMaxSpeed ;
    private double transportConsuption ;

    public WaterTransport(){

    }

    public WaterTransport(int transportCapacity,int transportMaxSpeed,double transportConsuption ){
        super();
        this.transportCapacity=transportCapacity;
        this.transportMaxSpeed=transportMaxSpeed;
        this.transportConsuption=transportConsuption;
    }

    @Override
    public String toString() {
        return "WaterTransport{" +
                "transportCapacity=" + transportCapacity +
                ", transportMaxSpeed=" + transportMaxSpeed +
                ", transportConsuption=" + transportConsuption +
                '}';
    }

    public int getTransportCapacity() {
        return transportCapacity;
    }

    public void setTransportCapacity(int transportCapacity) {
        this.transportCapacity = transportCapacity;
    }

    public int getTransportMaxSpeed() {
        return transportMaxSpeed;
    }

    public void setTransportMaxSpeed(int transportMaxSpeed) {
        this.transportMaxSpeed = transportMaxSpeed;
    }

    public double getTransportConsuption() {
        return transportConsuption;
    }

    public void setTransportConsuption(double transportConsuption) {
        this.transportConsuption = transportConsuption;
    }
}
