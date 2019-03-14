package ua.lviv.iot.WaterTransport.manager;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.WaterTransport.model.*;



public  class WaterTransportManager implements IWaterTransportManager {
    private List<WaterTransport> waterTransports;


    public WaterTransportManager(List<WaterTransport> Transport) {
        this.waterTransports = Transport;
    }

    public WaterTransportManager() {

    }


    public List<WaterTransport> findForMaxSpeed(List<WaterTransport> transport,int  transportMaxSpeed ) {

        List<WaterTransport> findForMaxSpeed = waterTransports.stream()
                .filter(Transport -> Transport.getTransportMaxSpeed() == transportMaxSpeed).collect(Collectors.toList());
        return findForMaxSpeed;
    }


    public List<WaterTransport> findForCapacity(List<WaterTransport> transport,int  transportCapacity) {

        List<WaterTransport> findForCapacity = waterTransports.stream()
                .filter(Transport -> Transport.getTransportCapacity() == transportCapacity).collect(Collectors.toList());
        return findForCapacity;
    }






    public List<WaterTransport> sortByConsuption(List<WaterTransport> Transport, boolean reverse) {
        Comparator<WaterTransport> comparator = ((WaterTransport k1, WaterTransport k2) -> (int) (k1.getTransportConsuption() - k2.getTransportConsuption()));
        Transport.sort(comparator);
        if (reverse) {
            Collections.reverse(Transport);
        }
        return Transport;
    }

    public List<WaterTransport> getWaterTransports() {
        return waterTransports;
    }

    public void setWaterTransports(List<WaterTransport> waterTransports) {
        this.waterTransports = waterTransports;
    }
}


