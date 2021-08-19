// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class King extends Piece{
    private boolean isInitialPos;

    public King(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[5]);
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
