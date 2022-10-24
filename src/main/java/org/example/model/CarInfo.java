package org.example.model;

import java.util.Objects;

public class CarInfo {

    private final Car carName;
    private final CarDistance carDistance;

    public CarInfo(final Car carName, final CarDistance carDistance) {
        this.carName = carName;
        this.carDistance = carDistance;
    }

    public Car getCarName() {
        return carName;
    }

    public CarDistance getCarDistance() {
        return carDistance;
    }

}
