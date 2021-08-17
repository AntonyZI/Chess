// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Cell {
    private boolean occupied;
    private Piece piece;
    
    public Cell(){
    }
    
    public void setOccupied(boolean oc){
        this.occupied = oc;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
    }
    public Piece getPiece(){
        return this.piece;
    }
}
