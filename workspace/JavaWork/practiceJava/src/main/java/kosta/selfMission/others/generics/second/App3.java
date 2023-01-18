package kosta.selfMission.others.generics.second;

import java.util.ArrayList;
import java.util.List;

class Data3 {
    public <E> void printListData(List<E> list){
        for(E element : list){
            System.out.println(element);
        }

    }

    public <E> void printArrayData(E[] arrayData){
        for (E element: arrayData){
            System.out.println(element);
        }
    }
}


public class App3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Data3 data3 = new Data3();
        data3.printListData(list);


        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        data3.printListData(list2);
        String[] stringArray = {"one", "two", "three"};
        Data3 data32 = new Data3();
        data32.printArrayData(stringArray);


    }
}
