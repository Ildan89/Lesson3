import fruits.Apple;
import fruits.Box;
import fruits.Fruit;
import fruits.Orange;
import myCollections.MyArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson3App {
    public static void main(String[] args) {
        //-------------------- ЗАДАНИЕ 1 -----------------------
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(myArrayList);
        myArrayList.swapTwoElements(1, 3);
        System.out.println(myArrayList);

        //-------------------- ЗАДАНИЕ 2 -----------------------
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        appleBox1.add(new Apple(), new Apple(), new Apple(), new Apple());
        appleBox2.add(new Apple(), new Apple(), new Apple());
        orangeBox1.add(new Orange(), new Orange());
        appleBox1.printInfo();
        appleBox2.printInfo();
        orangeBox1.printInfo();

        System.out.println(appleBox2.compare(appleBox1));
        System.out.println(appleBox2.compare(orangeBox1));
        System.out.println("пересыпали фрукты из appleBox1 в appleBox2:");

        appleBox1.transferFruitsToBox(appleBox2);
        appleBox1.printInfo();
        appleBox2.printInfo();
    }
}
