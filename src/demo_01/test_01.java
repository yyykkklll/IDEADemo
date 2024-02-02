package demo_01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yklsfzy
 * @date 2024/1/30/0030 20:35:10
 */
public class test_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        for (int i : list) {
            System.out.print(i);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        list.forEach(System.out::print);
    }
}
