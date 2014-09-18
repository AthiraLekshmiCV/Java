/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amrita1;

/**
 *
 * @author athiralekshmicv
 */
public class Person {
    
    private int id;
    private String name;

    @Override
    public String toString(){
        String result="The name of the student is" + name + "his id is" + id;
        return result;
    }
    }
