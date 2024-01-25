package programmers.Lv0.옷가게할인받기;

public class Solution {
    public int solution(int price) {
        if (price >= 500000)
            price *= 0.8;
        else if (price >= 300000)
            price *= 0.9;
        else if (price >= 100000)
            price *= 0.95;

        return price;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();
        int price = 150000;
        System.out.println(s.solution(price));
    }
}
