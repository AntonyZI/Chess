// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Bishop extends Piece{

    public Bishop(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[3]);
    }
}
