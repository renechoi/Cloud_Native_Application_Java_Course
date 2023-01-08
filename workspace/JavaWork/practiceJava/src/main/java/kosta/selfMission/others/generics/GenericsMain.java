package kosta.selfMission.others.generics;

public class GenericsMain {
    public static void main(String[] args) {

        withGenericsProblemSolved();

    }

    private static void withGenericsProblemSolved() {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("el 1");
        list.addElement("el 2");
        String value = list.get(0);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(1);
        list2.addElement(2);
        Integer number = list2.get(0);
    }

    private static void whyGenericsIsNeeded() {
//        MyCustomList list = new MyCustomList();
//        list.addElement("el 1");
//        list.addElement("el 2");

        // 만약에 여기서 기능이 정확하게 일치하는데 String이 아니라 integer 클래스를 만들고 싶다면 ?
        // => generics이 필요한 이유

//        MyCustomList list2 = new MyCustomList();
//        list2.addElement(5);
    }
}
