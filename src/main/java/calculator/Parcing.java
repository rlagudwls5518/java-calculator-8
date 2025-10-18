package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Parcing {
    static String[] inputDataArray;
    static ArrayList<Integer> Numlist = new ArrayList<>();
    private static String determine = "[,:]";

    //사용자가 입력하고 구분자를 기준으로 나누는 메서드
    public static void InputSeperater() {
        inputDataArray = Console.readLine().split(determine);
        FindNum(inputDataArray);
        Calculator.EceptionError(inputDataArray, Numlist);
    }

    //구분자를 기준으로 분리한 배열에서 숫자만 추출하는 메서드
    public static void FindNum(String[] strings) {
        for (String s : strings) {
            int dataNumber = Integer.parseInt(s.replaceAll("[^0-9-]", ""));
            Numlist.add(dataNumber);
        }
    }
}
