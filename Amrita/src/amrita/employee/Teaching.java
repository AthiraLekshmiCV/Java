/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amrita.employee;
import amrita1.Person;
/**
 *
 * @author athiralekshmicv
 */
public class Teaching extends Person{

    private String designation;
    private String subject;
    @Override
    public String toString(){
        String result="the designation of the Teaching employee is"+ designation + "and the subject handled is"
                      +subject;
        return result;
    }
}
