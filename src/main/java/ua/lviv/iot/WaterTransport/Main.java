package ua.lviv.iot.WaterTransport;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.WaterTransport.manager.WaterTransportManager;
import ua.lviv.iot.WaterTransport.model.RiverTram;
import ua.lviv.iot.WaterTransport.model.MotorShip;
import ua.lviv.iot.WaterTransport.model.AirCushion;
import ua.lviv.iot.WaterTransport.model.WaterTransport;


public class Main {

    public static void main(String[] args) {
        WaterTransportManager manager = new WaterTransportManager();
        AirCushion airCushion = new AirCushion(4, 50, 75, 160);
        MotorShip motorShip = new MotorShip(150, 55, 230, "disel");
        RiverTram riverTram = new RiverTram(110, 40, 70, "green");

        List<WaterTransport> listTransport = new ArrayList();
        listTransport.add(airCushion);
        listTransport.add(motorShip);
        listTransport.add(riverTram);

        System.out.println(manager.findForCapacity(listTransport, 50));
        System.out.println("\n");
        System.out.println(manager.findForMaxSpeed(listTransport, 200));
        System.out.println("\n");
        System.out.println(manager.sortByConsuption(listTransport, true).toString());

    }
}
