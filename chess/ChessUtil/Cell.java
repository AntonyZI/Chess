// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Cell {
    private boolean occupied;
    private Piece piece;
    
    public Cell(){
    }
    
    public static Cell[] getEmptyRow(){
    //Returns a row of cells with no pieces
        Cell[] emptyR = new Cell[8];
        for(int i=0;i<emptyR.length;i++){
            emptyR[i] = new Cell();
            emptyR[i].setPiece(null);
        }
        return emptyR;
    }
    public static Cell[] getBasicArmyRow(int posY){
    //Returns a row of cells with pawns without a team
        Cell[] emptyR = new Cell[8];
        for(int i=0;i<emptyR.length;i++){
            emptyR[i] = new Cell();
            emptyR[i].setPiece(new Pawn(i,posY));
        }
        return emptyR;
    }
    public static Cell[] getAdvancedArmyRow(int posY){
    //Returns a row of cells with advanced army pieces without a team
        Cell[] emptyR = new Cell[8];
        for(int i=0;i<emptyR.length;i++){
            emptyR[i] = new Cell();
        }
        emptyR[0].setPiece(new Rook(0,posY));
        emptyR[1].setPiece(new Knight(1,posY));
        emptyR[2].setPiece(new Bishop(2,posY));
        emptyR[3].setPiece(new Queen(3,posY));
        emptyR[4].setPiece(new King(4,posY));
        emptyR[5].setPiece(new Bishop(5,posY));
        emptyR[6].setPiece(new Knight(6,posY));
        emptyR[7].setPiece(new Rook(7,posY));
        
        return emptyR;
    }
    
    public void setOccupied(boolean oc){
        // No recomenado para usar
        this.occupied = oc;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
        if(piece == null){
            //System.out.println("Piece is null:");
            //System.out.println(piece);
            setOccupied(false);
        } else {
            //System.out.println("Piece is occupied");
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
