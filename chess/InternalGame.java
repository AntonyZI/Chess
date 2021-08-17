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
                System.out.println("("+i+"; "+j+"): "+chessboard[j][i]);
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
    public static InternalGame autoGenChessboard(){
        InternalGame inGame = new InternalGame();
        for(int j=0;j<inGame.chessboard.length;j++){
            for(int i=0;i<inGame.chessboard[j].length;i++){
                Cell theCell = new Cell();
                if(Math.random()<=0.5){
                    theCell.setPiece(null);
                } else {
                    theCell.setPiece(Piece.autogen(i,j));
                }
                inGame.chessboard[j][i] = theCell;
            }
        }
        return inGame;
    }
    public static void main(String[] args){
        InternalGame theGame = InternalGame.autoGenChessboard();
        System.out.println(theGame.getChessBoardString());
    }
}
