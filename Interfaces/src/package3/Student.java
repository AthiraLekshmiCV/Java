
package package3;
import package2.Evaluation;


public class Student implements Evaluation {
    int id;
    String name;
    double HomeAssignmentmarks;
    double ClassTestmarks;
    double Periodicalmarks;
    double Endexammarks;

   
   @Override
    public double evaluate(){
        double result;
        result=((HomeAssignmentmarks*homeassignments)+(ClassTestmarks*ClassTests)+(Periodicalmarks*Periodicals)
                +(Endexammarks*EndExam))/100;
        return result;
        
    }
   public void setName( String nm){
       name=nm;
   }
   public void setId(int Id){
       id=Id;
   }
   public void getMarks(double one,double two,double three,double four){
      HomeAssignmentmarks=one;
      ClassTestmarks=two;
      Periodicalmarks=three;
      Endexammarks=four;
   
   }
}

