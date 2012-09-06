/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Wesley
 */
public class GameBoard {

    private String map;
    private String hexes;
    private String color;

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getHexes() {
        return hexes;
    }

    public void setHexes(String hexes) {
        this.hexes = hexes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void giveOrentation(String map, String hexes, String color) {
        this.setMap(map);
        this.setHexes(hexes);
        this.setColor(color);
        ///validate gameboard map must be laid out first before you can add hexes
        /// and colors



    }
}