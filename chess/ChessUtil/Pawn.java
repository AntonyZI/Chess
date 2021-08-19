// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Pawn extends Piece{
    private boolean isInitialPos;
    
    public Pawn(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[0]);
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