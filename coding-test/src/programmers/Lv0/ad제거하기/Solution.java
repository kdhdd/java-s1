package programmers.Lv0.ad제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        String[] strArr = {"and", "notad", "abcd"};

        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("ad"))
                list.remove(i);
/*        순차적으로 삭제하면
                1. 초기 리스트:{"and", "notad", "abcd"}
                2. 첫 번째 원소 "and"를 검사하고 삭제하면, 리스트는 {"notad", "abcd"}
                3. 두 번째 원소 "abcd"를 검사하고 삭제하려고 하면, 인덱스 1의 원소를 삭제하게 된다.
                하지만 예상했던 것처럼 "abcd"가 삭제되어야 하는게 아니라 "notad"여야 한다.
                그래서 역순으로 순회하면, 뒤에서부터 원소를 검사하고 삭제하므로 앞쪽의 인덱스에 영향을 미치지
                따라서 정확한 삭제가 가능하다.*/

            for (String s : list) {
                System.out.println(s);
            }
            String[] answer = list.toArray(new String[list.size()]);
        }
    }
}
