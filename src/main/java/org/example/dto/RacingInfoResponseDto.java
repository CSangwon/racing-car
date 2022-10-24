package org.example.dto;

import org.example.model.Car;
import org.example.view.OutputData;

import java.util.ArrayList;
import java.util.List;

public class RacingInfoResponseDto {

    private final List<Car> ranking;

    public RacingInfoResponseDto(List<Car> ranking) {
        this.ranking = rankingListToString(ranking);
    }

    private List<Car> rankingListToString(List<Car> ranking) {
        List<Car> rankingList = new ArrayList<>();
        for (Car car : ranking) {
            rankingList.add(car);
        }
        return rankingList;
    }

    public void printResult(){
        OutputData.printResult(this.ranking);
    }
}
