package org.example;

import java.time.LocalDateTime;

public final class Observation {
    private final String plateNumber;
    private final LocalDateTime date;
    private final CarType carType;
    private final int speed;
    private final boolean beltFastened;

    //Constructor
    public Observation(String plateNumber, LocalDateTime date, CarType carType, int speed, boolean beltFastened) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.beltFastened = beltFastened;
    }

    //Getter
    public String getPlateNumber(){
        return plateNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSpeed() {
            return speed;
    }

    public boolean isBeltFastened() {
        return beltFastened;
    }
}
