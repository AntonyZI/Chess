// Autor: Antony Jacob Blanco Trujillo

package chess;

import chess.ChessUtil.*;
import java.awt.Color;

public class InternalGame {
    private Cell[][] chessboard = new Cell[8][8];
    private Team[] teams;
    
    public InternalGame(){
        
    }
    
    public boolean validateMove(int posX1,int posY1,int posX2,int posY2){
        // Verify if a move is valid to been performed
        // then this move won't have errors when used in move()
        return false;
    }
    public void move(int posX1,int posY1,int posX2,int posY2){
        // Will move a piece to another position, "killing" a piece if there
        // is one in that place
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
    
    public void resetStartGame(){
        // This code will do the same as static method genStartGame
        // but in the object (won't generate anything)
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
    
    public static InternalGame genStartGame(){
        InternalGame inGame = new InternalGame();
        inGame.setTeams(InternalGame.autogenTeams());
        
        inGame.getChessboard()[0] = Cell.getAdvancedArmyRow(0);
        inGame.getChessboard()[1] = Cell.getBasicArmyRow(1);
        for(int j=0;j<=1;j++){
            Cell.setTeamToRow(inGame.getChessboard()[j],inGame.getTeams()[0]);
        }
        for(int j=2;j<=5;j++){
            inGame.getChessboard()[j] = Cell.getEmptyRow();
        }
        inGame.getChessboard()[6] = Cell.getAdvancedArmyRow(6);
        inGame.getChessboard()[7] = Cell.getBasicArmyRow(7);
        for(int j=6;j<=7;j++){
            Cell.setTeamToRow(inGame.getChessboard()[j],inGame.getTeams()[1]);
        }
        
        return inGame;
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
    
    public static void main(String[] args){
        System.out.println(InternalGame.genStartGame().getChessBoardString());
    }
}
