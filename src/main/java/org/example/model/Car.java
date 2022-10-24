package org.example.model;

import java.util.Objects;

public class Car {
    public static final String ERROR_BY_EXCEED_CAR_NAME = "자동차의 이름은 5글자를 넘길 수 없습니다.";
    public static final String ERROR_BY_CAR_NAME_EMPTY = "자동차 이름은 비어있을 수 없습니다.";

    private final String carName;

    public Car(final String carName){
        extracted(carName);
        this.carName = carName;
    }

    private static void extracted(final String name){
        if (name.length() > 5){
            throw new IllegalArgumentException(ERROR_BY_EXCEED_CAR_NAME);
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException(ERROR_BY_CAR_NAME_EMPTY);
        }
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
