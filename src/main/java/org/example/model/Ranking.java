package org.example.model;

import java.util.*;

public class Ranking {

    private Ranking(){}

    public static List<Car> rank(List<CarInfo> carInfos) {
        Collections.sort(carInfos, (a, b) -> b.getCarDistance().getCarDistance() - a.getCarDistance().getCarDistance());
        CarInfo maxCarInfo = carInfos.get(0);

        List<Car> result = new ArrayList<>();
        for (CarInfo carInfo : carInfos){
            checkMaxRanking(maxCarInfo, result, carInfo);
        }

        return result;
    }

    private static void checkMaxRanking(CarInfo maxCarInfo, List<Car> result, CarInfo carInfo) {
        if (carInfo.getCarDistance().equals(maxCarInfo.getCarDistance())) {
            result.add(carInfo.getCarName());
        }
    }

}
