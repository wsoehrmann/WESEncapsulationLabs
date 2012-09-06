/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Wesley
 */
public class Game {

    private String walking;
    private String talking;
    private String fighting;

    public String getWalking() {
        return walking;
    }

    public void setWalking(String walking) {
        this.walking = walking;
    }

    public String getTalking() {
        return talking;
    }

    public void setTalking(String talking) {
        this.talking = talking;
    }

    public String getFighting() {
        return fighting;
    }

    public void setFighting(String fighting) {
        this.fighting = fighting;
    }

    public void showMovement(String walking, String talking, String fighting) {
        this.setWalking(walking);
        this.setTalking(talking);
        this.setFighting(fighting);
        ///validate these are done in correct order must talk to person or creature
        /// in order to fight it

    }
}
