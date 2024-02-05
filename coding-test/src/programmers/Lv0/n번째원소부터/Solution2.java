package programmers.Lv0.n번째원소부터;

public class Solution2 {
    public static void main(String[] args) {

        int[] num_list = {2, 1, 6};
        int n = 3;

        int[] answer = new int[num_list.length-(n-1)];
        for (int i=n-1; i< num_list.length; i++) {
            answer[i-(n-1)] = num_list[i];
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
