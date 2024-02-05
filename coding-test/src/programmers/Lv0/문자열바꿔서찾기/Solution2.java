package programmers.Lv0.문자열바꿔서찾기;

public class Solution2 {
    public static void main(String[] args) {

        String myString = "ABBAA";
        String pat = "AABB";

        myString = myString.replace("A", "X").replace("B", "A").replace("X", "B");

        int answer = myString.contains(pat) ? 1 : 0;
        System.out.println(answer);
    }
}
