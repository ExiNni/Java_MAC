package chess.model;

public class ChessModel {
    private char[][] board;

    public ChessModel() {
        board = new char[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        board[0][3] = '♛'; 
        board[0][4] = '♚'; 
        
        board[7][3] = '♕'; 
        board[7][4] = '♔'; 

        for (int col = 0; col < 8; col++) {
            board[1][col] = '♟';
        }

        // 흰색 Pawn 초기 배치 (행 번호 6)
        for (int col = 0; col < 8; col++) {
            board[6][col] = '♙';
        }

        // 나머지 보드 위치는 공백으로 초기화
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public char getPieceAt(int row, int col) {
        return board[row][col];
    }

    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        char piece = board[fromRow][fromCol];
        board[toRow][toCol] = piece;
        board[fromRow][fromCol] = ' ';
    }

    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        char piece = board[fromRow][fromCol];
        char targetPiece = board[toRow][toCol];

        int rowDiff = Math.abs(toRow - fromRow);
        int colDiff = Math.abs(toCol - fromCol);

        if (Character.toLowerCase(piece) == 'p') {
            if (fromCol == toCol && targetPiece == ' ') {
                if (piece == 'p' && toRow > fromRow && rowDiff == 1) {
                    return true;
                }
                if (piece == 'P' && toRow < fromRow && rowDiff == 1) {
                    return true;
                }
            }
            if (Math.abs(toCol - fromCol) == 1 && rowDiff == 1) {
                if (piece == 'p' && toRow > fromRow && targetPiece != ' ' && Character.isUpperCase(targetPiece)) {
                    return true;
                }
                if (piece == 'P' && toRow < fromRow && targetPiece != ' ' && Character.isLowerCase(targetPiece)) {
                    return true;
                }
            }
            return false;
        }

        if (Character.toLowerCase(piece) == 'k') {
            return rowDiff <= 1 && colDiff <= 1;
        }

        if (Character.toLowerCase(piece) == 'q') {
            return (fromRow == toRow || fromCol == toCol || rowDiff == colDiff);
        }

        return false;
    }

    public char[][] getBoard() {
        return board;
    }
}
