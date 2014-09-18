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
public class Nonteaching extends Person {
    private int salary;
    private String dept;
    @Override
    public String toString(){
        return ("the salary of the Non teaching emplyee belonging to dept " + dept + "is " +salary);
    }
    
}

