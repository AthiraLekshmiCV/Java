
package inheritance.teacher;
import inheritance.person.Person;

public class Teacher extends Person{
    int numCourses;
    String[] courses;
    int tos;
    public Teacher(String name,String add,int ncourses){
        super(name,add);
        numCourses=ncourses;
        courses=new String[numCourses];
        tos=0;
        
    }
    @Override
    public String tostring(){
        return "numcourses";
    }
    public boolean addCourse(String course){
        
            if(tos!=courses.length ){
           
                   courses[tos++]=course;
                   return true;
                   
            }
            else
                return false;
       
    }
    public void printCourse(){
        for(int i=0;i<courses.length;i++){
            System.out.println(courses[i]);
        }
    
    }
    
}
