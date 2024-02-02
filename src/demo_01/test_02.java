package demo_01;

import java.util.ArrayList;

/**
 * @author yklsfzy
 * @date 2024/1/31/0031 20:40:07
 */
public class test_02 {
    public static void main(String[] args) {
        HaShiQiDog dog = new HaShiQiDog();
        dog.setName("哈士奇");
        dog.setAge(1);
        System.out.println(dog.toString());
        KeepPet(new ArrayList<Animal>());
    }

    public static void KeepPet(ArrayList<? extends Animal> list){
    }
}
