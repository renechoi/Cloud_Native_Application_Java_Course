package kosta.basic.day008.boardExample2;

public class BoardMain {
    public static void main(String[] args) {

    }

    private static void practiceObjectWithArray2() {
        Board[] boards = {
                new Board("1", "java", "홍길동", "자바 잘하자 !"),
                new Board("2", "db", "박길동", "db 잘하자 !")
        };

        for (Board board : boards){
            board.print();
        }
    }

    private static void practiceObjectWithArray() {
        Board[] boards = new Board[2];

        boards[0] = new Board("1", "java", "홍길동", "자바 잘하자 !");
        boards[1] = new Board("2", "db", "박길동", "db 잘하자 !");

        for (Board board : boards){
            board.print();
        }
    }

    private static void practiceCallObject() {
        Board board1 = new Board();
        board1.print();

        Board board2 = new Board("1", "java", "홍길동", "자바 잘하자 !");
        Board board3 = new Board("2", "db", "박길동", "db 잘하자 !");

        board2.print();
        board3.print();
    }
}
