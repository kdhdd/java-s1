package programmers.Lv0.날짜비교하기;

public class Solution {
    public static void main(String[] args) {

        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};

        int answer = 0;
        for (int i=0; i<3; i++) {
            if (date1[i] != date2[i]) {
                answer = date1[i] < date2[i] ? 1 : 0;
                break;
            }
        }
        System.out.println(answer);
    }
}
