// Autor: Antony Jacob Blanco Trujillo

package chess;

import chess.ChessUtil.*;
import java.awt.Color;

public class InternalGame {
    private Cell[][] chessboard = new Cell[8][8];
    private Team[] teams;
    
    public InternalGame(){
        
    }
    
    public String getChessBoardString(){
        String strOut = "";
        for(int j=0;j<chessboard.length;j++){
            for(int i=0;i<chessboard[j].length;i++){
                //System.out.print("("+i+"; "+j+"): "+chessboard[j][i]);
                //System.out.println(" - "+chessboard[j][i].isOccupied());
                if(chessboard[j][i].isOccupied()){
                    strOut += "("+chessboard[j][i].getPiece().getTeam().getName()+")";
                    strOut += chessboard[j][i].getPiece().getChar()+" ";
                } else {
                    strOut += "(-----)";
                    strOut += "- ";
                }
            }
            strOut += "\n";
        }
        return strOut;
    }
    
    public static Team[] autogenTeams(){
        Team[] tms = new Team[2];
        tms[0] = new Team("White",Color.WHITE);
        tms[1] = new Team("Black",Color.BLACK);
        return tms;
    }
    public static InternalGame autogenChessboard(Team[] tms){
        InternalGame inGame = new InternalGame();
        for(int j=0;j<inGame.chessboard.length;j++){
            for(int i=0;i<inGame.chessboard[j].length;i++){
                Cell theCell = new Cell();
                if(Math.random()<=0.5){
                    theCell.setPiece(null);
                } else {
                    theCell.setPiece(Piece.autogen(i,j));
                    theCell.getPiece().setTeam(tms[(int)(Math.random()*2)]);
                }
                inGame.chessboard[j][i] = theCell;
            }
        }
        return inGame;
    }
    
    public void setChessboard(Cell[][] chessboard){
        this.chessboard = chessboard;
    }
    public void setTeams(Team[] teams){
        this.teams = teams;
    }
    public Cell[][] getChessboard(){
        return this.chessboard;
    }
    public Team[] getTeams(){
        return this.teams;
    }
    
    
    public static void main(String[] args){
        Team[] teams = InternalGame.autogenTeams();
        InternalGame theGame = InternalGame.autogenChessboard(teams);
        System.out.println(theGame.getChessBoardString());
    }
}
