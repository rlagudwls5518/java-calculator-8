package calculator;

import java.util.ArrayList;

public class Parcing {
    static String[] inputDataArray;
    static ArrayList<Integer> Numlist = new ArrayList<>();
    private static String determine = "[,:]";

    //사용자가 입력하고 구분자를 기준으로 나누는 메서드
    public static void InputSeperater(String s) {
        ExceptionStringEmpty(s);

        inputDataArray = s.split(determine);

        FindNum(inputDataArray);
        EceptionError(inputDataArray, Numlist);
    }

    //구분자를 기준으로 분리한 배열에서 숫자만 추출하는 메서드
    private static void FindNum(String[] strings) {
        for (String s : strings) {
            String cleaned = s.replaceAll("[^0-9-]", "");
            int dataNumber = Integer.parseInt(cleaned);
            Numlist.add(dataNumber);
        }
    }

    private static void ExceptionStringEmpty(String s) {
        if (s.trim().isEmpty()) {
            //System.out.println("결과 : 0");
            throw new IllegalArgumentException("공백입니다");
        }

    }

    private static void EceptionError(String[] strings, ArrayList<Integer> list) {
        for (int a : list) {
            if (a < 0) {
                throw new IllegalArgumentException("음수는 안됩니다");
            }
        }
    }
}
