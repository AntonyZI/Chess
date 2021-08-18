// Autor: Antony Jacob Blanco Trujillo

package chess.ChessUtil;

import java.awt.Color;

public class Team {
    private String name;
    private Color teamColor;
    
    public Team(String n,Color tC){
        setName(n);
        setTeamColor(tC);
    }
    
    
    public String getName() {
        return name;
    }
    public Color getTeamColor() {
        return teamColor;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setTeamColor(Color teamColor) {
        this.teamColor = teamColor;
    }
}
