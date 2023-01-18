package kosta.selfMission.others.generics.second;


class Data5<T extends Comparable<T>> implements Comparable<T> {
    private T myValue;

    public Data5(T myValue) {
        this.myValue = myValue;
    }

    public T getMyValue() {
        return myValue;
    }

    @Override
    public String toString() {
        return "Data5{" +
                "myValue=" + myValue +
                '}';
    }

    @Override
    public int compareTo(T that) {
        return myValue.compareTo(that);
    }
}

public class App5 {
    public static void main(String[] args) {
        Data5<Integer> data = new Data5<Integer>(1);
        System.out.println(data.compareTo(1));

        Data5<Integer> data2 = new Data5<Integer>(0);
        System.out.println(data2.compareTo(1));

        Data5<Integer> data3 = new Data5<Integer>(2);
        System.out.println(data3.compareTo(1));
    }
}
