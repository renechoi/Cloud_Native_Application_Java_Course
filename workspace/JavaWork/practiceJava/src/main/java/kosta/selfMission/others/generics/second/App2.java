package kosta.selfMission.others.generics.second;


import java.util.Scanner;

class Data2<K, V> {
    private K key;
    private V value;


    public Data2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }


    public <E, N> void display(E element, N number){
        System.out.println("Element: " + element + "Number: "+number);
    }
}

public class App2 {
    public static void main(String[] args) {
        Data2<Integer, String> data = new Data2<>(1, "Chaand");
        System.out.println("key: " + data.getKey() + "value: " + data.getValue());
        data.display("element",2);
    }


}

