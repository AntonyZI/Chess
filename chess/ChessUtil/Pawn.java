// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Pawn extends Piece{

    public Pawn(int posX, int posY) {
        super(posX, posY);
    }
    
    public char getChar(){
        return 'P';
    }
}
