package kosta.basic.java.day008.boardExample2;

public class Board {
    // 특성 : 글번호, 제목, 작성자, 글내용
    // 기능 : 출력하는 메서드

    String no;
    String title;
    String writer;
    String contents;

    public Board(){}

    public Board(String no, String title, String writer, String contents) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.contents = contents;
    }

    public void print(){
        System.out.printf("%s %s %s %s \n", no, title,writer,contents);
    }
}
