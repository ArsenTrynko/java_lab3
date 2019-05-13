package ua.lviv.iot.WaterTransport.model;

public class WaterTransport {
    private int transportCapacity;
    private int transportMaxSpeed;
    private double transportConsuption;

    public WaterTransport() {

    }

    public  WaterTransport(final int transportCapacity, final int transportMaxSpeed, final double transportConsuption) {
        super();
        this.transportCapacity = transportCapacity;
        this.transportMaxSpeed = transportMaxSpeed;
        this.transportConsuption = transportConsuption;
    }

    @Override
    public String toString() {
        return "WaterTransport{"
                +
                "transportCapacity="
                + transportCapacity
                +
                ", transportMaxSpeed="
                + transportMaxSpeed
                +
                ", transportConsuption="
                + transportConsuption
                +
                '}';
    }

    public final int getTransportCapacity() {
        return transportCapacity;
    }

    public  final void setTransportCapacity(final int transportCapacity) {
        this.transportCapacity = transportCapacity;
    }

    public final int getTransportMaxSpeed() {
        return transportMaxSpeed;
    }

    public final void setTransportMaxSpeed(final int transportMaxSpeed) {
        this.transportMaxSpeed = transportMaxSpeed; }

    public final double getTransportConsuption() {
        return transportConsuption;
    }

    public final void setTransportConsuption(final double transportConsuption) {
        this.transportConsuption = transportConsuption;
    }
}
