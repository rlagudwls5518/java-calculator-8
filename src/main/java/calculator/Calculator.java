package calculator;

import java.util.ArrayList;

public class Calculator {

    public static void Run() {
        Parcing.Numlist.clear();
        InputData();
        Sum();
    }

    //입력하는 메서드
    private static void InputData() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        Parcing.InputSeperater();
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

    //예외처리
    public static void EceptionError(String[] strings, ArrayList<Integer> list) {

        for (String s : strings) {
            if (s == null || s.isBlank()) {
                throw new IllegalArgumentException("문자열은 공백일 수 없습니다.");
            }
        }
        for (int a : list) {
            if (a < 0) {
                throw new IllegalArgumentException("음수는 안됩니다");
            }
        }
    }
}
