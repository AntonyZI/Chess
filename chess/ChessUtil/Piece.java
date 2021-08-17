// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Piece {
    public static char[] PIECES = {'P','R','N','B','Q','K'};
    private int posX;
    private int posY;
    
    public Piece(int posX,int posY){
        setPosX(posX);
        setPosY(posY);
    }
    
    public static Piece autogen(int posX,int posY){
        Piece autoP;
        int rndPiece = (int)(Math.random()*PIECES.length);
        switch(rndPiece){
            case 0:
                 autoP = new Pawn(posX,posY);
            case 1:
                 autoP = new Rook(posX,posY);
            case 2:
                 autoP = new Knight(posX,posY);
            case 3:
                 autoP = new Bishop(posX,posY);
            case 4:
                 autoP = new Queen(posX,posY);
            case 5:
                 autoP = new King(posX,posY);
            default:
                autoP = null;
        }
        return autoP;
    }
    
    public char getChar(){
        // Dummy method
        return 5; // Represents the 5th character to java: 
    }
    
    public void setPosX(int posX){
        this.posX = posX;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
    
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}
