package kosta.basic.java.day016.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> exampleList = new ArrayList<>();

        for (int i =0; i< exampleList.size(); i++){
            System.out.println(exampleList.get(i));
        }

        Iterator<String> iterator = exampleList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        exampleList.stream().forEach(element -> System.out.println(element));



    }


}
