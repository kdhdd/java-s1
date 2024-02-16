package programmers.Lv0._7의개수;

public class Solution {
    public static void main(String[] args) {

        int[] array = {7, 77, 17};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String value = String.valueOf(array[i]);
            if (value.contains("7")) {
                String[] strArray = value.split("");
                for (String alpha : strArray) {
                    if (alpha.equals("7")) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
