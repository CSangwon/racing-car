package org.example.dto;

public class RacingInfoRequestDto {
    private final String[] carInfoList;
    private final int racingCycle;

    public RacingInfoRequestDto(final String[] carInfoList, final int racingCycle){
        this.carInfoList = carInfoList;
        this.racingCycle = racingCycle;
    }

    public String[] getCarInfoList() {
        return carInfoList;
    }

    public int getRacingCycle() {
        return racingCycle;
    }




}
