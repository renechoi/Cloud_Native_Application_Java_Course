package kosta.selfMission.others.generics.second;

public class Data {
    private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}


class App {
    public static void main(String[] args) {
//        Data data = new Data("Some String");
//        String variable = (String) data.getObj();
//
//        System.out.println(variable);

//        NOT GOOD USE !!!!!
//        GenericClass genericClass = new GenericClass("Some data");
//        GenericClass genericClass2 = new GenericClass(12345);
//        String data = (String) genericClass.getData();
//        int data2 = (int) genericClass2.getData();


        GenericClass<String> genericClass = new GenericClass<String>("Some data");
        GenericClass<Integer> genericClass2 = new GenericClass<Integer>(12345);
        String data = (String) genericClass.getData();
        int data2 = (int) genericClass2.getData();



    }
}
