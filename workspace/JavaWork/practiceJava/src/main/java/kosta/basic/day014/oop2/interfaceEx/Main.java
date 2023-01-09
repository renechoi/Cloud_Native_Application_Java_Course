package kosta.basic.day014.oop2.interfaceEx;

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


    }
}
