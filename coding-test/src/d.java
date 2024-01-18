import java.util.ArrayList;

public class d {

    public static void main(String[] args) {
        ArrayList<String> lan = new ArrayList<>();
        lan.add("java");
        lan.add("python");
        lan.add("c");

        String[] arr1 = new String[lan.size()];
        lan.toArray(arr1);

        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
