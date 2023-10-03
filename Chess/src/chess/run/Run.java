package chess.run;

import chess.controller.ChessController;
import chess.model.ChessModel;
import chess.view.ChessView;

public class Run {
    public static void main(String[] args) {
        ChessModel model = new ChessModel();
        ChessView view = new ChessView();
        ChessController controller = new ChessController(model, view);

        System.out.println("1번 플레이어는 White입니다.");
        System.out.println("2번 플레이어는 Black입니다.");

        System.out.println("말을 움직여 시작해주세요.");

        controller.playGame();

    }
}

