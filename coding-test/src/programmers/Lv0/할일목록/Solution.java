package programmers.Lv0.할일목록;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        List<String> list = new ArrayList<>();

        for (int i=0; i< todo_list.length; i++) {
            if (!finished[i])
                list.add(todo_list[i]);
        }
        String[] answer = list.toArray(new String[list.size()]);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
