package kosta.basic.java.day014.oop2.interfaceEx;

public class MySQLDao implements Dao{
    @Override
    public void insert() {
        System.out.println("MySQL insert!");
    }
}
