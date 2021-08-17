// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Cell {
    private boolean occupied;
    private Piece piece;
    
    public Cell(){
    }
    
    public void setOccupied(boolean oc){
        // No recomenado para usar
        this.occupied = oc;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
        if(piece == null){
            setOccupied(false);
        } else {
            setOccupied(true);
        }
    }
    public boolean isOccupied(){
        return this.occupied;
    }
    public Piece getPiece(){
        return this.piece;
    }
}
