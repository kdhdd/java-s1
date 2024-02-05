package programmers.Lv0.가장큰수찾기;

public class Solution {
    public static void main(String[] args) {

        int[] array = {1, 8, 3};
        int max = 0;
        int index = 0;
        for (int i=0; i< array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        int[] answer = {max, index};
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
