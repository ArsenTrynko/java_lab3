package ua.lviv.iot.WaterTransport.model;

public class AirCushion extends WaterTransport {
    private NumberOfBlades numberOfBlades;

public AirCushion( int transportCapacity, int transportMaxSpeed, int transportConsuption){

}




    public AirCushion(int numberOfBlades,int transportCapacity,int transportMaxSpeed,double transportConsuption){
        super(transportCapacity, transportMaxSpeed, transportConsuption);

    }



    @Override
    public String toString() {
        return "AirCushion{" +
                "numberOfBlades=" + numberOfBlades +
                '}';

    }

    public NumberOfBlades getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(NumberOfBlades numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }
}
