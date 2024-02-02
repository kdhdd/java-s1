package programmers.Lv0.개미군단;

public class Solution {
    public static void main(String[] args) {

        int hp = 23;

        int count = hp / 5 + (hp % 5) / 3 + hp % 5 % 3;
        System.out.println(count);
    }
}
