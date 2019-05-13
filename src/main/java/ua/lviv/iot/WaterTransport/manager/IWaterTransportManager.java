package ua.lviv.iot.WaterTransport.manager;

import java.util.List;

import ua.lviv.iot.WaterTransport.model.WaterTransport;


public interface IWaterTransportManager {
     List<WaterTransport> findForMaxSpeed(List<WaterTransport> transport, int transportMaxSpeed);

     List<WaterTransport> findForCapacity(List<WaterTransport> transport, int transportCapacity);

     List<WaterTransport> sortByConsuption(List<WaterTransport> transport, boolean reverse);

}


