package demo_01;

import java.util.TreeSet;

/**
 * @author yklsfzy
 * @date 2024/2/1/0001 12:07:12
 */
public class test_05 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan", 18, 100, 90, 95);
        Student2 s2 = new Student2("lisi", 19, 90, 60, 75);
        Student2 s3 = new Student2("wangwu", 17, 80, 60, 95);
        Student2 s4 = new Student2("mazi", 17, 90, 70, 95);
        Student2 s5 = new Student2("zhangsan", 18, 90, 90, 95);
        TreeSet<Student2> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
