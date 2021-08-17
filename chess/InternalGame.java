// Autor: Antony Jacob Blanco Trujillo

package chess;

import chess.ChessUtil.*;

public class InternalGame {
    private Cell[][] chessboard = new Cell[8][8];
    
    public InternalGame(){
        
    }
    
    public String getChessBoardString(){
        String strOut = "";
        for(int j=0;j<chessboard.length;j++){
            for(int i=0;i<chessboard[j].length;i++){
                if(chessboard[j][i].isOccupied()){
                    strOut += chessboard[j][i].getPiece().getChar()+" ";
                } else {
                    strOut += "- ";
                }
            }
            strOut += "\n";
        }
        return strOut;
    }
    public void autoGenChessboard(){
        for(int j=0;j<chessboard.length;j++){
            for(int i=0;i<chessboard[j].length;i++){
                Cell theCell = new Cell();
                if(Math.random()<=0.5){
                    theCell.setPiece(null);
                } else {
                    theCell.setPiece(new Pawn(i,j));
                }
                chessboard[j][i] = theCell;
            }
        }
    }
    public static void main(String[] args){
        InternalGame theGame = new InternalGame();
        theGame.autoGenChessboard();
        System.out.println(theGame.getChessBoardString());
    }
}
