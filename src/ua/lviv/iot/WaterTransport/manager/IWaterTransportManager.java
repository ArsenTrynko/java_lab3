package ua.lviv.iot.WaterTransport.manager;
import java.util.List;

import ua.lviv.iot.WaterTransport.model.NumberOfBlades;
import ua.lviv.iot.WaterTransport.model.WaterTransport;


    public  interface IWaterTransportManager {
        public List<WaterTransport> findForblades(List<WaterTransport> transport, NumberOfBlades numberOfBlades);
        public List<WaterTransport> sortBycapacity(List<WaterTransport> transport, boolean reverse);

        public  List<WaterTransport> sortByConsuption(List<WaterTransport> Transport,boolean reverse);

    }


