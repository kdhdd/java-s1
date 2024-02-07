package programmers.Lv0.문자열뒤집기;

public class Solution {
    public static void main(String[] args) {

        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;

//        String str = my_string.substring(s, e+1);
//        StringBuilder sb = new StringBuilder(my_string);
//        StringBuilder str2 = new StringBuilder(str).reverse();
//        sb = sb.delete(s, e+1);
//        sb = sb.insert(s, str2);
//        String answer = sb.toString();
//        System.out.println(answer);
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        String answer = my_string.substring(0, s) + sb + my_string.substring(e + 1);
        System.out.println(answer);
    }
}
