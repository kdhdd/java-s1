package programmers.Lv0.n의배수고르기;

public class Solution2 {
    public static void main(String[] args) {

        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 3;

        int count = 0;
        for (int i : numlist) {
            if (i % n == 0)
                count++;
        }

        int[] answer = new int[count];
        int idx = 0;
        for (int i : numlist) {
            if (i % n == 0) {
                answer[idx] = i;
                idx++;
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
