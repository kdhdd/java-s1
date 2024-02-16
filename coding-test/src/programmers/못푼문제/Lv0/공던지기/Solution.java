package programmers.못푼문제.Lv0.공던지기;

public class Solution {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        int k = 2;

        int answer = 0;
        int index = 0; // numbers 값을 가져올 때 사용할 index

        /* k번째로 공을 던지는 사람을 구하기 위한 반복문,
        오른쪽으로 한 명을 건너뛰기 위해 index 값에 2씩 더해줌*/
        for (int i = 1; i < k; i++) {
            index += 2;
        }

        index %= numbers.length; // index 값이 배열의 길이보다 커질 수 있기 때문에 나눠줌
        answer = numbers[index]; // 구한 index 값을 index로 가지는 배열 값(공을 던지는 사람의 번호)을 넣어줌

        System.out.println(answer);

    }
}
