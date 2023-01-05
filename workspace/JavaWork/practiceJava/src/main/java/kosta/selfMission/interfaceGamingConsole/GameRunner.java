package kosta.selfMission.interfaceGamingConsole;

public class GameRunner {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        marioGame.up();

        ChessGame chessGame = new ChessGame();
        chessGame.left();
    }
}
