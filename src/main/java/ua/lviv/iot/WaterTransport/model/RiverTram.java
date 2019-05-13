package ua.lviv.iot.WaterTransport.model;

public class RiverTram extends WaterTransport {
    private String color;


    public RiverTram() {
    }

    public RiverTram(int transportCapacity, int transportMaxSpeed, double transportConsuption, String color) {
        super(transportCapacity, transportMaxSpeed, transportConsuption);
        this.color = color;
    }

    @Override
    public String toString() {
        return "RiverTram{"
                +
                "Color='"
                + color
                + '\''
                +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }
}
