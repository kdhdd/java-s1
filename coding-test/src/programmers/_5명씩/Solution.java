package programmers._5명씩;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        List<String> list = new ArrayList<>();

        for (int i=0; i< names.length; i++) {
            if (i % 5 == 0)
                list.add(names[i]);
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
