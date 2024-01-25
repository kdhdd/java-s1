package programmers.Lv0.Stream사용.배열뒤집기_Stream사용_흐름;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        //int[] -> IntStream : .stream(num_list)
        //IntStream -> Stream<Integer> : .boxed()
        //Stream<Integer> -> List : .collect(Collectors.toList())
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
        //List -> Stream : .stream()
        //Stream -> IntStream : .mapToInt(i -> i)
        //IntStream -> int[] : .toArray();
    }
}
