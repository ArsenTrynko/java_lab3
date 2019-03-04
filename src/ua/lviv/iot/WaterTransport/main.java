package ua.lviv.iot.WaterTransport;

import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.WaterTransport.manager.WaterTransportManager;
import ua.lviv.iot.WaterTransport.model.*;

import static ua.lviv.iot.WaterTransport.model.NumberOfBlades.*;

public class main {

    public static void main(String[] args) {
WaterTransportManager manager = new WaterTransportManager();
AirCushion airCushion = new AirCushion(4,50,75,160);
MotorShip motorShip = new MotorShip(150,55,230,"disel");
RiverTram riverTram = new RiverTram(110,40,70,"green");

        List<WaterTransport> listDevice = new ArrayList();
        listDevice.add(airCushion);
        listDevice.add(motorShip);
        listDevice.add(riverTram);

        System.out.println(manager.findForCapacity(listDevice, NumberOfBlades.two));
        System.out.println("\n");
        System.out.println(manager.findForMaxSpeed(listDevice, NumberOfBlades.eight));
        System.out.println("\n");
        System.out.println(manager.sortByConsuption(listDevice, true).toString());

    }
}
