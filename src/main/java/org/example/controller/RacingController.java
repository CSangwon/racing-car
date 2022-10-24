package org.example.controller;

import org.example.dto.RacingInfoRequestDto;
import org.example.model.Car;
import org.example.model.CarDistance;
import org.example.model.CarInfo;
import org.example.model.Racing;
import org.example.model.Ranking;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    private final RacingInfoRequestDto racingInfoRequestDto;

    public RacingController(final RacingInfoRequestDto racingInfoRequestDto) {
        this.racingInfoRequestDto = racingInfoRequestDto;
    }

    public List<Car> racing(){
        List<CarInfo> carInfos = racingCarInfoConvertToList(racingInfoRequestDto.getCarInfoList());
        Racing.race(carInfos, racingInfoRequestDto.getRacingCycle());
         return Ranking.rank(carInfos);

    }
    private List<CarInfo> racingCarInfoConvertToList(final String[] racingCarInfo){
        List<CarInfo> carInfos = new ArrayList<>();
        for(String car : racingCarInfo){
            carInfos.add(new CarInfo(new Car(car), new CarDistance()));
        }
        return carInfos;
    }


}
