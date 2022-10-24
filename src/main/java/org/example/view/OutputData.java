package org.example.view;

import org.example.model.Car;
import org.example.model.CarInfo;

import java.util.List;
import java.util.stream.Collectors;

public class OutputData {

    private static final String WINNER_MESSAGE = "가 최종 우승했습니다.";

    private OutputData(){}

    public static void printProgressMessage(){
        System.out.println("실행 결과");
    }

    public static void printProgress(List<CarInfo> calculation) {

        for(CarInfo carInfo : calculation){
            System.out.print(carInfo.getCarName().getCarName() + " : ");
            System.out.println(printDistance(carInfo.getCarDistance().getCarDistance()));
        }
        System.out.println();
    }
    private static String printDistance(int carDistance){
        String distanceResult = "-";
        for(int i = 0; i < carDistance; i++){
            distanceResult += "-";
        }
        return distanceResult;
    }
    public static void printResult(List<Car> ranking){
        System.out.print(String.join(",", ranking.stream().map(Car::getCarName).collect(Collectors.toList())));
        System.out.println(WINNER_MESSAGE);
    }

}
