package ua.lviv.iot.WaterTransport.model;

public class RiverTram extends WaterTransport {
    private String Color;


    public RiverTram(){
    }

    public RiverTram(int transportCapacity,int transportMaxSpeed,double transportConsuption,String color){
        super(transportCapacity, transportMaxSpeed, transportConsuption);
        this.Color=color;
    }

    @Override
    public String toString() {
        return "RiverTram{" +
                "Color='" + Color + '\'' +
                '}';
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
