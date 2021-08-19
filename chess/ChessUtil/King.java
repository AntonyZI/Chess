// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class King extends Piece{

    public King(int posX, int posY) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[5]);
    }
}
