package kosta.basic.java.day014.oop2.interfaceEx;

public class OracleDao implements Dao{
    @Override
    public void insert() {
        System.out.println("Oracle insert!");
    }
}
