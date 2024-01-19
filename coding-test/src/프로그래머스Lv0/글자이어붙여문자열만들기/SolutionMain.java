package 프로그래머스Lv0.글자이어붙여문자열만들기;

public class SolutionMain {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String my_string = "zpiaz";
        int[] index_list = {1, 2, 0, 0, 3};
        System.out.println(solution.solution(my_string, index_list));
    }
}
