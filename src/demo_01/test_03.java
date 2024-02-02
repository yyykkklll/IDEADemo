package demo_01;

import java.util.TreeSet;

/**
 * @author yklsfzy
 * @date 2024/2/1/0001 11:48:29
 */
public class test_03 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 16);
        Student s3 = new Student("wangwu", 13);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
