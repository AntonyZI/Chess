// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class King extends Piece{
    private boolean isInitialPos;

    public King(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[5]);
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
    
    /**
     * @return the isInitialPos
     */
    public boolean isInitialPos() {
        return isInitialPos;
    }

    /**
     * @param isInitialPos the isInitialPos to set
     */
    public void setIsInitialPos(boolean isInitialPos) {
        this.isInitialPos = isInitialPos;
    }
    
}
