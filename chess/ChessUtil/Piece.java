// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

public class Piece {
    private int posX;
    private int posY;
    
    public Piece(int posX,int posY){
        setPosX(posX);
        setPosY(posY);
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
