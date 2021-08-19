// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Pawn extends Piece{
    public static int NORTH = 1;
    public static int WEST = 2;
    public static int SOUTH = 3;
    public static int EAST = 4;
    private boolean isInitialPos;
    private int facing;
    
    public Pawn(int posX,int posY,int facing) {
        super(posX, posY);
        this.setRepChar(Piece.PIECES[0]);
        this.setFacing(facing);
    }
    
    public boolean isLegalMove(Cell[][] cb,int[] move){
    // Verifies if the "move" is a legal move in the "cb" chessboard
        return false;
    }
    public int[] legalMoves(Cell[][] cb){
    // Returns an array of positions representing legal moves for this piece
    // in the cb chessboard
        return null;
    }
    
    public boolean isInitialPos() {
        return isInitialPos;
    }
    public int getFacing() {
        return facing;
    }
    public boolean isFacingNorth(){
        return facing == NORTH;
    }
    public boolean isFacingWest(){
        return facing == WEST;
    }
    public boolean isFacingSouth(){
        return facing == SOUTH;
    }
    public boolean isFacingEast(){
        return facing == EAST;
    }
    
    public void setIsInitialPos(boolean isInitialPos) {
        this.isInitialPos = isInitialPos;
    }
    public void setFacing(int facing) {
        this.facing = facing;
    }
    
}