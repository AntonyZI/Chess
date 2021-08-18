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
        }
        setEmptyRow(emptyR);
        return emptyR;
    }
    public static void setEmptyRow(Cell[] row){
    // Makes every cell in row to not have a piece
    // the row must not have null objects in it
        for(int i=0;i<row.length;i++){
            row[i].setPiece(null);
        }
    }
    public static Cell[] getBasicArmyRow(int posY){
    //Returns a row of cells with pawns without a team
        Cell[] emptyR = new Cell[8];
        for(int i=0;i<emptyR.length;i++){
            emptyR[i] = new Cell();
        }
        setBasicArmyRow(posY,emptyR);
        return emptyR;
    }
    public static void setBasicArmyRow(int posY,Cell[] row){
    // Makes every cell in row to have a basic army piece
    // the row must not have null objects in it
        for(int i=0;i<row.length;i++){
            row[i].setPiece(new Pawn(i,posY));
        }
    }
    public static Cell[] getAdvancedArmyRow(int posY){
    //Returns a row of cells with advanced army pieces without a team
        Cell[] emptyR = new Cell[8];
        for(int i=0;i<emptyR.length;i++){
            emptyR[i] = new Cell();
        }
        setAdvancedArmyRow(posY,emptyR);
        
        return emptyR;
    }
    public static void setAdvancedArmyRow(int posY,Cell[] row){
    //Returns a row of cells with advanced army pieces without a team
        row[0].setPiece(new Rook(0,posY));
        row[1].setPiece(new Knight(1,posY));
        row[2].setPiece(new Bishop(2,posY));
        row[3].setPiece(new Queen(3,posY));
        row[4].setPiece(new King(4,posY));
        row[5].setPiece(new Bishop(5,posY));
        row[6].setPiece(new Knight(6,posY));
        row[7].setPiece(new Rook(7,posY));
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
