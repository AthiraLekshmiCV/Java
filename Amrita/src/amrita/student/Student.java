/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amrita.student;
import amrita1.Person;
import interests.*;
/**
 *
 * @author athiralekshmicv
 */
public class Student  extends Person , implements Hobby,implements Talents{
    private int sem;
    private String course;

@Override
public String toString(){
   return ("the course" + course +"is offered in semester" + sem);
}   


}
