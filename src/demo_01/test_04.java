package demo_01;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author yklsfzy
 * @date 2024/2/1/0001 11:59:22
 */
public class test_04 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                return i == 0 ? o1.compareTo(o2) : i;
            }
        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }
}
