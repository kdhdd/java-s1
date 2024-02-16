package programmers.Lv0.컨트롤제트;

public class Solution {
    public static void main(String[] args) {

        String s = "1 2 Z 3";
        int answer = 0;

        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("Z"))
                answer -= Integer.parseInt(strArr[i - 1]);
            else
                answer += Integer.parseInt(strArr[i]);
        }

        System.out.println(answer);

    }
}
