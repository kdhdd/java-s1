package programmers.Lv0.문자열붙여서출력하기;


import java.util.Scanner;

public class SolutionRef {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        String result1 = answer(a);
        String result2 = answer(b);

        System.out.println(result1);
        System.out.println(result2);
    }

    static String answer(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                answer += c;
            }
        }
        return answer;
    }
}
