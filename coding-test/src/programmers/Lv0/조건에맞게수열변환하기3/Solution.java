package programmers.Lv0.조건에맞게수열변환하기3;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 2;

        for (int i=0; i<arr.length; i++) {
            if (k%2==0)
                arr[i] += k;
            else
                arr[i] *= k;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
