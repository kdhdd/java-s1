package programmers.Lv0.숫자찾기;

public class Solution {
    public static void main(String[] args) {

        int num = 29183;
        int k = 1;
        int answer = 0;

//        String s = Integer.toString(num);
//        for (int i=0; i<s.length(); i++) {
//            char c = s.charAt(i);
//            String s2 = Character.toString(c);
//            int num2 = Integer.parseInt(s2);
//            if (num2 == k)
//                answer = i;
//        }
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        answer = numStr.indexOf(kStr);
        answer = answer < 0 ? -1 : answer + 1;
        System.out.println(answer);
    }
}
