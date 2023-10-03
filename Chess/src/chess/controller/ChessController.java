package chess.controller;

import chess.model.ChessModel;
import chess.view.ChessView;


public class ChessController {
    private ChessModel model;
    private ChessView view;
    private boolean isPlayer1Turn;

    public ChessController(ChessModel model, ChessView view) {
        this.model = model;
        this.view = view;
        isPlayer1Turn = true;
    }

    public void playGame() {
        boolean isGameOver = false;

        while (!isGameOver) {
            view.displayBoard(model.getBoard());
            System.out.println(isPlayer1Turn ? "플레이어 1의 차례" : "플레이어 2의 차례");

            String fromSquare = view.getPieceSelection();
            if (isValidSquareFormat(fromSquare)) {
                int fromRow = 8 - Character.getNumericValue(fromSquare.charAt(1));
                int fromCol = fromSquare.charAt(0) - 'a';

                char selectedPiece = model.getPieceAt(fromRow, fromCol);

                if (isPlayer1Turn && Character.isUpperCase(selectedPiece) ||
                    !isPlayer1Turn && Character.isLowerCase(selectedPiece)) {
                    String toSquare = view.getMoveDestination();
                    if (isValidSquareFormat(toSquare)) {
                        int toRow = 8 - Character.getNumericValue(toSquare.charAt(1));
                        int toCol = toSquare.charAt(0) - 'a';

                        if (model.isValidMove(fromRow, fromCol, toRow, toCol)) {
                            model.movePiece(fromRow, fromCol, toRow, toCol);
                            isGameOver = checkGameOver();
                            isPlayer1Turn = !isPlayer1Turn;
                        } else {
                            System.out.println("유효하지 않은 이동입니다. 다시 시도하세요.");
                        }
                    } else {
                        System.out.println("유효하지 않은 목적지 칸 형식입니다. 다시 시도하세요.");
                    }
                } else {
                    System.out.println("유효하지 않은 말 선택입니다. 다시 시도하세요.");
                }
            } else {
                System.out.println("유효하지 않은 칸 형식입니다. 다시 시도하세요.");
            }
        }

        view.displayBoard(model.getBoard());
        System.out.println("게임 종료!");
    }

    private boolean isValidSquareFormat(String square) {
        return square.matches("[a-h][1-8]");
    }

    private boolean isKingDead(char kingSymbol) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (model.getPieceAt(row, col) == kingSymbol) {
                    return false; // 살아있는 King을 찾았으면 false 반환
                }
            }
        }
        return true;
    }

    private boolean checkGameOver() {
        char currentPlayerKing = isPlayer1Turn ? 'k' : 'K';

        int currentPlayerKingRow = -1;
        int currentPlayerKingCol = -1;
        outerLoop:
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (model.getPieceAt(row, col) == currentPlayerKing) {
                    currentPlayerKingRow = row;
                    currentPlayerKingCol = col;
                    break outerLoop;
                }
            }
        }

        if (currentPlayerKingRow == -1 || currentPlayerKingCol == -1) {
            return true; 
        }

        return false;
    }
}
