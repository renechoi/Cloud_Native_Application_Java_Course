package kosta.selfMission.others.generics.second;


class Data4<K extends Integer, V extends App4> {
    private K key;
    private V value;

    public Data4(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "data4{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }


    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    // restrict type parameter
    public <E,N extends Number> void display(E element, N number){
        System.out.println("Element: " + element + "number: "+number);
    }
}


public class App4 {
    public static void main(String[] args) {
        Data4<Integer, App4> data4 = new Data4<>(1, new App4());
        data4.display("el", 1);
        data4.getValue().test();


    }
    public void test(){
        System.out.println("testing");
    }
}

