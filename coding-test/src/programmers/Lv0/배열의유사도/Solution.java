package programmers.Lv0.배열의유사도;

public class Solution {
    public static void main(String[] args) {

        int answer = 0;
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        for (int i=0; i<s1.length; i++) {
            for (int j=0; j<s2.length; j++) {
                if (s1[i].equals(s2[j]))
                    answer++;
            }
        }

        System.out.println(answer);
    }
}
