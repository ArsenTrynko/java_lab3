package ua.lviv.iot.WaterTransport.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.WaterTransport.model.WaterTransport;


public class WaterTransportManager implements IWaterTransportManager {
    private List<WaterTransport> waterTransports;


    public WaterTransportManager(List<WaterTransport> transport) {
        this.waterTransports = transport;
    }

    public WaterTransportManager() {

    }


    public List<WaterTransport> findForMaxSpeed(List<WaterTransport> transport, int transportMaxSpeed) {

        List<WaterTransport> findForMaxSpeed = waterTransports.stream()
                .filter(Transport -> Transport.getTransportMaxSpeed() == transportMaxSpeed).collect(Collectors.toList());
        return findForMaxSpeed;
    }


    public List<WaterTransport> findForCapacity(List<WaterTransport> transport, int transportCapacity) {

        return waterTransports.stream()
                .filter(Transport -> Transport.getTransportCapacity() == transportCapacity).collect(Collectors.toList());
    }


    public List<WaterTransport> sortByConsuption(List<WaterTransport> transport, boolean reverse) {
        Comparator<WaterTransport> comparator = ((WaterTransport k1, WaterTransport k2) -> (int) (k1.getTransportConsuption() - k2.getTransportConsuption()));
        if (reverse) {
            Collections.reverse(transport);
        } else {
            transport.sort(comparator);
        }
        return transport;
    }

    public List<WaterTransport> getWaterTransports() {
        return waterTransports;
    }

    public void setWaterTransports(List<WaterTransport> waterTransports) {
        this.waterTransports = waterTransports;
    }
}


