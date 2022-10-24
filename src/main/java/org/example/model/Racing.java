package org.example.model;

import org.example.view.OutputData;

import java.util.List;

public class Racing {

    private Racing (){}

    public static void race(final List<CarInfo> carInfos, final int racingCycle){
        OutputData.printProgressMessage();
        for (int i = 0; i < racingCycle; i++) {
            List<CarInfo> calculation = CalculateCarDistance.calculation(carInfos);
            OutputData.printProgress(calculation);
        }
    }






}
