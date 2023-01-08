package kosta.selfMission.others.generics;

import java.util.ArrayList;

public class GenericsMain {
    public static void main(String[] args) {



    }

    private static void whyGenericsIsNeeded() {
        MyCustomList list = new MyCustomList();
        list.addElement("el 1");
        list.addElement("el 2");

        // 만약에 여기서 기능이 정확하게 일치하는데 String이 아니라 integer 클래스를 만들고 싶다면 ?
        // => generics이 필요한 이유

//        MyCustomList list2 = new MyCustomList();
//        list2.addElement(5);
    }
}
