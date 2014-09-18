
package inheritance;

import inheritance.student.*;
import inheritance.teacher.*;
import java.util.*;

/**
 *
 * @author athiralekshmicv
 */
public class Inheritance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
   
        System.out.println("Enter the name of the student");
        String s1= in.nextLine();
        System.out.println("Enter the address of the student");
        String s2=in.nextLine();
        System.out.println("Enter the number of courses");
        int n=in.nextInt();
        Student S1=new Student(s1,s2,n);
        System.out.println("Enter the course and the grades obtained of the student");
            String[] sd=new String[n];
            int[] nd=new int[n];
            for(int i=0;i<n;i++){
                Scanner it=new Scanner(System.in);
                System.out.print("Course:");
                sd[i]=it.nextLine();
                System.out.print("Grade:");
                nd[i]=it.nextInt();
                
                S1.addCourseGrade(sd[i], nd[i]);
            }
            System.out.println("The grades of the student"+S1.getname()+ " "+ S1.getaddress() +"is as follows");
            S1.printGrades();
            System.out.println("The average grade of the student is"+ S1.getAverageGrade());
           
           
            System.out.println("Enter the details of the teacher");
            Scanner ir=new Scanner(System.in);
            System.out.println("Name:");
            s1=ir.nextLine();
            System.out.println("Address:");
            s2=ir.nextLine();
       
            System.out.println("Enter the number of courses");
            int no=in.nextInt();
            boolean f;
            Teacher t1=new Teacher(s1,s2,no);   
            String[] sq=new String[no];
             for(int i=0;i<no;i++){
                Scanner id=new Scanner(System.in);
                System.out.print("Course:");
                sq[i]=id.nextLine();
                f= t1.addCourse(sq[i]);
                
            }
            t1.printCourse();
       
    }
}
