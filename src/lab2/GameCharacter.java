/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Wesley
 */
public class GameCharacter {

    private String name;
    private String race;
    private String appearance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void createCharacter(String name, String race, String appearance) {
        this.setName(name);
        this.setRace(race);
        this.setAppearance(appearance);
        ////validate entering name, race and appearance
    }
}
