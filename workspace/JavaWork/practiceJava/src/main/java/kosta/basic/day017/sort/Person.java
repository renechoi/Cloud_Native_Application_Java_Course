package kosta.basic.day017.sort;

public class Person implements Comparable<Integer> {
    private int age;


    @Override
    public int compareTo(Integer thatAge) {
        return Integer.compare(this.age, thatAge);
    }
}


