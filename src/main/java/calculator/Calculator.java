package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;

public class Calculator {

    public static void Run() {
        Parcing.Numlist.clear();
        InputData();
        Sum();
    }

    private static String InputTest() {
        try {
            return Console.readLine();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    //입력하는 메서드
    private static void InputData() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String inputString = InputTest();

        if (ExceptionStringEmpty(inputString)) {
            return;
        }
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

    //입력 없거나 빈문자열일때
    private static boolean ExceptionStringEmpty(String s) {
        if (s == null) {
            return true;
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        return false;
    }

}
