package chess.view;

import java.util.Scanner;

public class ChessView {
    public void displayBoard(char[][] board) {
        System.out.println("    a   b   c   d   e   f   g   h");
        System.out.println("  ---------------------------------");

        for (int row = 0; row < 8; row++) {
            System.out.print((8 - row) + " |");
            for (int col = 0; col < 8; col++) {
                System.out.print(" " + board[row][col] + " |");
            }
            System.out.println("\n   ---------------------------------");
        }
    }

    public String getPieceSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("말을 선택하세요 (예: 'a2'): ");
            String square = scanner.nextLine().trim().toLowerCase();
            if (isValidSquareFormat(square)) {
                return square;
            } else {
                System.out.println("유효하지 않은 칸 형식입니다. 다시 시도하세요.");
            }
        }
    }

    public String getMoveDestination() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("목적지를 선택하세요 (예: 'a4'): ");
            String square = scanner.nextLine().trim().toLowerCase();
            if (isValidSquareFormat(square)) {
                return square;
            } else {
                System.out.println("유효하지 않은 칸 형식입니다. 다시 시도하세요.");
            }
        }
    }

    private boolean isValidSquareFormat(String square) {
        return square.matches("[a-h][1-8]");
    }
}