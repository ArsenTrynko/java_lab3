package ua.lviv.iot;

import ua.lviv.iot.WaterTransport.manager.WaterTransportManager;
import ua.lviv.iot.WaterTransport.model.AirCushion;
import ua.lviv.iot.WaterTransport.model.MotorShip;
import ua.lviv.iot.WaterTransport.model.RiverTram;
import ua.lviv.iot.WaterTransport.model.WaterTransport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class appTest {

    private WaterTransportManager manager = new WaterTransportManager();
    private List<WaterTransport> listTransport = new ArrayList<>();

    @BeforeEach
    final void addList() {

        manager.addTransport(new MotorShip(150, 55, 230, "disel"));
        manager.addTransport(new RiverTram(110, 40, 70, "green"));
        AirCushion airCushion = new AirCushion(4, 50, 75, 160);
        MotorShip motorShip = new MotorShip(150, 55, 230, "disel");
        RiverTram riverTram = new RiverTram(110, 40, 70, "green");

        manager.addTransport(airCushion);

        //List<WaterTransport> listTransport = new ArrayList();
        listTransport.add(airCushion);
        listTransport.add(motorShip);
        listTransport.add(riverTram);
    }

    @Test
    final void sortByConsuptionAscending() {
        manager.sortByConsuption(listTransport, true);
        Assertions.assertEquals(70, listTransport.get(0).getTransportConsuption());
        Assertions.assertEquals(160, listTransport.get(2).getTransportConsuption());
        Assertions.assertEquals(230, listTransport.get(1).getTransportConsuption());
    }

    @Test
    final void sortByConsuptionDescending() {
        manager.sortByConsuption(listTransport, false);
        Assertions.assertEquals(230, listTransport.get(2).getTransportConsuption());
        Assertions.assertEquals(160, listTransport.get(1).getTransportConsuption());
        Assertions.assertEquals(70, listTransport.get(0).getTransportConsuption());
    }

    @Test
    final void testfindForMaxSpeed() {
        Assertions.assertEquals(listTransport.get(0).getTransportMaxSpeed(), manager.findForMaxSpeed(listTransport, 75).get(0).getTransportMaxSpeed());
    }

    @Test
    final void testfindForCapacity() {
        Assertions.assertEquals(listTransport.get(0).getTransportCapacity(), manager.findForCapacity(listTransport, 50).get(0).getTransportCapacity());
    }
}
