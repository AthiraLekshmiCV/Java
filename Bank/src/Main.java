import package1.*; 
import package2.*; 
import package3.*; 
import java.util.*; 
class Main
{ 

    public static void main(String s[]) 
    { 

        CheckingAccount a1=new CheckingAccount(100.0,1.0); 
        Scanner in=new Scanner(System.in); 
        System.out.println("Current Balance is Rs:100");
        System.out.println("Enter the amount to be credited"); 
        double c=in.nextDouble(); 
        a1.credit(c); 
        System.out.println("Enter the amount to be debited"); 
        c=in.nextDouble();
        boolean b=a1.debit(c);
    
        
        

    } 
} 
