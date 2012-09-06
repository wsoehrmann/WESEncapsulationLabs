/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Wesley
 */
public class GameWorld {

    private String terrain;
    private String buildings;
    private String towns;

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getBuildings() {
        return buildings;
    }

    public void setBuildings(String buildings) {
        this.buildings = buildings;
    }

    public String getTowns() {
        return towns;
    }

    public void setTowns(String towns) {
        this.towns = towns;
    }

    public void lookOfWorld(String terrain, String towns, String buildings) {
        this.setTerrain(terrain);
        this.setTowns(towns);
        this.setBuildings(buildings);
        ///validation and code for setting game features must be set in this order





    }
}
