package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Calculator {
    static String[] inputDataArray;
    static ArrayList<Integer> Numlist = new ArrayList<>();

    public static void Run() {
        inputData();
        dataSum();
    }

    //입력하는 메서드
    private static void inputData() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        inputSeperater();
    }

    //사용자가 입력하고 구분자를 기준으로 나누는 메서드
    private static void inputSeperater() {
        inputDataArray = Console.readLine().split("[,:]");
        eceptionError(inputDataArray);
        findNum(inputDataArray);
    }

    //구분자를 기준으로 분리한 배열에서 숫자만 추출하는 메서드
    private static void findNum(String[] string) {
        for (String s : string) {
            int dataNumber = Integer.parseInt(s.replaceAll("[^0-9]", ""));
            //숫자를 추출했는데 배열에 어떻게 넣을 것인가??
            Numlist.add(dataNumber);
        }
    }

    //데이터 합치는 메서드
    private static void dataSum() {
        int sum = 0;

        for (int a : Numlist) {
            sum += a;
        }
        System.out.println("결과 : " + sum);
    }

    //예외처리
    private static void eceptionError(String[] strings) {

        for (String s : strings) {
            if (s == null || s.isBlank()) {
                throw new IllegalArgumentException("문자열은 null 또는 공백일 수 없습니다.");
            }
//            if (Integer.parseInt(s) < 0) {
//                throw new IllegalArgumentException("0이하는 안됩니다");
//            }
        }
    }
}
