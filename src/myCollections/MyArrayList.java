package myCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArrayList<T> extends ArrayList<T> {
    public MyArrayList() {
        super();
    }

    public void swapTwoElements(int index1, int index2) {
        T temp = get(index1);
        set(index1, get(index2));
        set(index2, temp);
    }

    public void add(T[] array) {
        Collections.addAll(this, array);
    }

}
