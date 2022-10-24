package org.example.model;

import java.util.List;
import java.util.Random;

public class CalculateCarDistance {

    public static final int RANDOM_BOUND = 10;

    private CalculateCarDistance(){
    }

    public static List<CarInfo> calculation(final List<CarInfo> carInfoList) {
        Random random = new Random();
        carForward(random, carInfoList);
        return carInfoList;
    }

    private static void carForward(Random random, List<CarInfo> carInfoList) {
        for (CarInfo carinfo : carInfoList) {
            increaseCarDistance(carinfo, random);
        }
    }

    private static void increaseCarDistance(CarInfo carInfo, Random random) {
        if (Movable.movable(randomData(random))){
            carInfo.getCarDistance().increaseDistance();
        }
    }

    private static int randomData(Random random) {
        return random.nextInt(RANDOM_BOUND);
    }
}
