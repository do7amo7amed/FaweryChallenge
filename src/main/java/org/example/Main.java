package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Radar radar = new Radar();

        radar.addRule(new PrivateSpeedRule(300));
        radar.addRule(new SeatbeltRule(100));
        radar.addRule(new TruckSpeedRule(300));

        // Observation 1
        Observation ob1 = new Observation("ABC1234", LocalDateTime.now(), CarType.PRIVATE, 94, false);

        // Observation 2
        Observation ob2 = new Observation("SDF456", LocalDateTime.now(), CarType.TRUCK, 60, false);

        // Observation 3
        Observation ob3 = new Observation("LMN987", LocalDateTime.now(), CarType.TRUCK, 100, true);

        radar.observe(ob1);
        radar.observe(ob2);
        radar.observe(ob3);

        radar.printAllFines();
        for (Fine fine : radar.getAllFines()) {

            System.out.println(fine.getPlateNumber() + " : " + fine.getTotalAmount()+ " EGP");
        }

    }
}