package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Calculator {
    static String[] inputDataArray;
    static ArrayList<Integer> Numlist = new ArrayList<>();
    static String determine = "[,:]";

    public static void Run() {
        Numlist.clear();
        InputData();
        Sum();
    }

    //입력하는 메서드
    private static void InputData() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        InputSeperater();
    }

    //사용자가 입력하고 구분자를 기준으로 나누는 메서드
    private static void InputSeperater() {
        inputDataArray = Console.readLine().split(determine);
        FindNum(inputDataArray);
        EceptionError(inputDataArray, Numlist);
    }

    //구분자를 기준으로 분리한 배열에서 숫자만 추출하는 메서드
    private static void FindNum(String[] strings) {
        for (String s : strings) {
            int dataNumber = Integer.parseInt(s.replaceAll("[^0-9-]", ""));
            Numlist.add(dataNumber);
        }
    }

    //데이터 합치는 메서드
    private static void Sum() {
        int sum = 0;

        for (int num : Numlist) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("결과 : " + sum);
    }

    //예외처리
    private static void EceptionError(String[] strings, ArrayList<Integer> list) {

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
