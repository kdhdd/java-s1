package programmers.Lv0.한번만등장한문자;

public class Solution {
    public static void main(String[] args) {

        String s = "abcabcadc";
        String answer = "";

        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            int num = c - '0';
            //System.out.println(num - 49);
            arr[num - 49]++;
        }

        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }

        System.out.println(answer);
    }
}
