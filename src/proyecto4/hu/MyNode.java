/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto4.hu;

/**
 *
 * @author User
 */
public class MyNode {
    
    private int id;
    private Actor actor;

    public MyNode() {
    }
    public MyNode(Actor actor){
        this.actor = actor;
    }
    
    public MyNode(int id) {
        this.id = id;
    }

    public MyNode(int id, Actor actor) {
        this.id = id;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "V"+id;
    }
    
    
    
}
