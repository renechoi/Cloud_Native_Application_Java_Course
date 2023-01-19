package kosta.basic.java.day014.oop2.interfaceEx;

public class Main {
    public static void main(String[] args) {
        MySQLDao mySQLDao = new MySQLDao();
        BoardService boardService1 = new BoardService(new MySQLDao());
        boardService1.insertBoard();

        BoardService boardService2 = new BoardService(new OracleDao());
        boardService2.insertBoard();

        BoardService msSql = new BoardService(new Dao() {
            @Override
            public void insert() {
                System.out.println("anonymous class msSql! ");
            }
        });
        msSql.insertBoard();

        BoardService mongoDb = new BoardService( ()-> System.out.println("구현을 해보자!") );



    }
}
