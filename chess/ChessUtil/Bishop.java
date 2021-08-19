// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Bishop extends Piece{

    public Bishop(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[3]);
    }
    
    public boolean isLegalMove(Cell[][] cb,int[] move){
    // Verifies if the "move" is a legal move in the "cb" chessboard
        return false;
    }
    public int[] legalMoves(Cell[][] cb){
    // Returns an array of positions representing legal moves for this piece
    // in the cb chessboard
        return null;
    }
    
}
