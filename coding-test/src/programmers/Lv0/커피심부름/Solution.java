package programmers.Lv0.커피심부름;

public class Solution {
    public static void main(String[] args) {

        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int answer = 0;

        for (String s : order) {
            if (s.equals("iceamericano") || s.equals("americanoice") ||
                    s.equals("hotamericano") || s.equals("americanohot") ||
                        s.equals("americano") || s.equals("anything"))
                answer += 4500;
            else
                answer += 5000;
        }

        System.out.println(answer);

    }
}
