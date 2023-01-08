package kosta.selfMission.others.generics;

import java.util.ArrayList;

public class MyCustomListOnlyNumber<T extends Number> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }
}

