// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Rook extends Piece{
    private boolean isInitialPos;

    public Rook(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[1]);
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
