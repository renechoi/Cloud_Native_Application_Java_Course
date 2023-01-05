package kosta.selfMission.oop.interfaceGamingConsole;

public class GameRunner {
    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        marioGame.up();

        ChessGame chessGame = new ChessGame();
        chessGame.left();

        InterfaceGamingConsole[] games = {new MarioGame(), new ChessGame()};

        for (InterfaceGamingConsole game : games){
            game.up();
            game.down();
            game.left();
            game.right();
        }

        // 같은 코드를 다른 두 클래스에서 호출하면서 다른 구현을 시킴 => 다형성



    }
}
