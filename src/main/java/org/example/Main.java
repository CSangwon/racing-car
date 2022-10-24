package org.example;

import org.example.controller.RacingController;
import org.example.dto.RacingInfoRequestDto;
import org.example.dto.RacingInfoResponseDto;
import org.example.view.InputData;

public class Main {
    public static void main(String[] args) {
        RacingInfoRequestDto racingInfoRequestDto = InputData.racingInfo();
        RacingController racingController = new RacingController(racingInfoRequestDto);
        racingController.racing();
        RacingInfoResponseDto responseDto = new RacingInfoResponseDto(racingController.racing());
        responseDto.printResult();
    }
}