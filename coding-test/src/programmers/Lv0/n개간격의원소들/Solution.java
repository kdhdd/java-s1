package programmers.Lv0.n개간격의원소들;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 4;

        int idx = 0;
        int[] answer = new int[(int) Math.ceil((double) num_list.length/n)];
        for (int i=0; i< num_list.length; i+=n) {
            answer[idx++] = num_list[i];
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
