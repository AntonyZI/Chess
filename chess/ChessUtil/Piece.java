// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Piece {
    public static char[] PIECES = {'P','R','N','B','Q','K'};
    private int posX;
    private int posY;
    private Team teamPiece;
    
    public Piece(int posX,int posY){
        setPosX(posX);
        setPosY(posY);
    }
    
    public static Piece autogen(int posX,int posY){
        int rndPiece = (int)(Math.random()*PIECES.length);
        //System.out.println(rndPiece);
        switch(rndPiece){
            case 0:
                 return new Pawn(posX,posY);
            case 1:
                 return new Rook(posX,posY);
            case 2:
                 return new Knight(posX,posY);
            case 3:
                 return new Bishop(posX,posY);
            case 4:
                 return new Queen(posX,posY);
            case 5:
                 return new King(posX,posY);
            default:
                return null;
        }
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
    public void setTeam(Team t){
        if(teamPiece != null){
            teamPiece.removePiece(this);
        }
        t.addPiece(this);
        this.teamPiece = t;
    }
    
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
    public Team getTeam(){
        return this.teamPiece;
    }
}
