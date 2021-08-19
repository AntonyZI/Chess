// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

import java.awt.Color;
import java.util.ArrayList;

public class Team {
    private String name;
    private Color teamColor;
    private ArrayList<Piece> pieces;
    
    public Team(String n,Color tC){
        setName(n);
        setTeamColor(tC);
    }
    
    
    public void addPiece(Piece piece){
        pieces.add(piece);
        piece.setTeam(this);
    }
    public void removePiece(Piece piece){
        if(pieces.remove(piece)){
            piece.setTeam(null);
        }
    }
    
    public String getName() {
        return name;
    }
    public Color getTeamColor() {
        return teamColor;
    }
    public ArrayList<Piece> getPieces() {
        return pieces;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setTeamColor(Color teamColor) {
        this.teamColor = teamColor;
    }
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
