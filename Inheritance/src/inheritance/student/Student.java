
package inheritance.student;
import inheritance.person.Person;
import java.lang.String;

 public class Student extends Person {
    int numCourses;
    String[] courses;
    int[] grades;
    int tos;
   
    public Student(String nm,String add,int nCourses){
     super(nm,add);
     numCourses=nCourses;
     courses=new String[numCourses];
     grades=new int[numCourses];
     tos=0;
    }
    
    @Override
    public String tostring(){
        return "numCourses";
       
    }
    public void addCourseGrade(String course,int grade){
        
            if(tos!=courses.length ){
           
                   courses[tos]=course;
                   grades[tos++]=grade;
                   
                }
    }
    public void printGrades(){
        for(int i=0;i<numCourses;i++){
            System.out.println("Course: " + courses[i] +"Grade: " + grades[i]);
        }
        
    }
    public double getAverageGrade(){
        double result=0;
        for(int i=0;i<numCourses;i++){
            result+=grades[i];
         
        }
        return result/=(double)numCourses;
    }
    

}
