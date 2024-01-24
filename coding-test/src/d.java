import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d {

    public static void main(String[] args) {
        Integer[] num_list = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(num_list);
        Collections.reverse(list);
        Integer[] answer = list.toArray(num_list);
        System.out.println(Arrays.toString(answer));

    }
}
