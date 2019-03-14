package ua.lviv.iot.WaterTransport.manager;
import java.util.List;

import ua.lviv.iot.WaterTransport.model.NumberOfBlades;
import ua.lviv.iot.WaterTransport.model.WaterTransport;


    public  interface IWaterTransportManager {
        public List<WaterTransport> findForMaxSpeed(List<WaterTransport> transport, int transportMaxSpeed);
        public List<WaterTransport>findForCapacity(List<WaterTransport> transport,int  transportCapacity);

        public  List<WaterTransport> sortByConsuption(List<WaterTransport> Transport,boolean reverse);

    }


