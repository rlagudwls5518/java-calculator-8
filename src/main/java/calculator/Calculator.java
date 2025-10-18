package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Calculator {

    public static void Run() {
        Parcing.Numlist.clear();
        InputData();
        Sum();
    }

    //입력하는 메서드
    private static void InputData() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String inputString = Console.readLine();
        Parcing.InputSeperater(inputString);
    }

    //데이터 합치는 메서드
    private static void Sum() {
        int sum = 0;

        for (int num : Parcing.Numlist) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("결과 : " + sum);
    }

}
