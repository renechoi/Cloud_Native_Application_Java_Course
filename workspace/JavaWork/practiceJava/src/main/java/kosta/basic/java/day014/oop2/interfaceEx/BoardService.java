package kosta.basic.java.day014.oop2.interfaceEx;

public class BoardService {
    private final Dao dao;

    public BoardService(Dao dao) {
        this.dao = dao;
    }

    public void insertBoard(){
        dao.insert();
    }
}
