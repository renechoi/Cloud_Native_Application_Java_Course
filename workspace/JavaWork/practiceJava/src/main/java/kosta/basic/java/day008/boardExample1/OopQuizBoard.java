package kosta.basic.java.day008.boardExample1;

public class OopQuizBoard {
    // 게시판을 구현해보자
    // 글번호, 제목, 작성자, 글 내용을 포함하는 내용으로
    // 게시판 글을 몇 개 생성하고 내용을 출력하는 메서드를 구현해 보자.

    public static void main(String[] args) {
        Document document1 = new Document(1,"monday","kim","today is monday!");
        Document document2 = new Document(2,"tuesday","hong","today is tuesday!");

        System.out.println(document1.documentContent);
        System.out.println(document2.documentContent);








        Board board = new Board();
        Document document3 = board.createDocument(3,"wednesday","lee","today is wednesday!");
        Document document4 = board.createDocument(4,"thursday","park","today is thursday!");
        System.out.println(document3.documentContent);
        System.out.println(document4.documentContent);

    }


}
