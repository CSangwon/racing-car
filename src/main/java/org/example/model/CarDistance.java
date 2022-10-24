package org.example.model;

import java.util.Objects;

public class CarDistance {

    public static final int DEFAULT_DISTANCE = 0;
    private int carDistance;

    public CarDistance(){
        this(DEFAULT_DISTANCE);
    }

    public CarDistance(final int carDistance) {
        this.carDistance = carDistance;
    }

    public void increaseDistance(){
        carDistance = carDistance + 1;
    }

    public int getCarDistance() {
        return carDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDistance that = (CarDistance) o;
        return carDistance == that.carDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carDistance);
    }
}
