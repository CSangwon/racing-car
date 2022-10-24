package org.example.view;

import org.example.dto.RacingInfoRequestDto;

import java.util.Scanner;

public class InputData {

    public static final String INPUT_MESSAGE_COUNT = "시도할 회수는 몇회인가요?";
    public static final String INPUT_MESSAGE_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";

    private InputData(){

    }

    public static RacingInfoRequestDto racingInfo(){
        Scanner scanner = new Scanner(System.in);
        return new RacingInfoRequestDto(inputCarInfo(scanner), inputRacingCycle(scanner));
    }

    public static String[] inputCarInfo(Scanner scanner) {
        System.out.println(INPUT_MESSAGE_CAR_NAME);
        return inputString(scanner).split(",");
    }

    public static int inputRacingCycle(Scanner scanner) {
        System.out.println(INPUT_MESSAGE_COUNT);
        return inputInt(scanner);
    }

    public static int inputInt(Scanner scanner){
        return scanner.nextInt();
    }

    public static String inputString(Scanner scanner){
        return scanner.nextLine();
    }


}
