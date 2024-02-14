package programmers.못푼문제.Lv0.k의개수_못푼문제;

public class Solution {
    public static void main(String[] args) {

        int i = 1;
        int j = 13;
        int k = 1;

        int count = 0;
        String strK = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String value = String.valueOf(l);
            if (value.contains(strK)) {
                String[] array = value.split("");
                for (String alpha : array) {
                    if (alpha.equals(strK)) count++;
                }
            }
        }

        System.out.println(count);
    }
}
