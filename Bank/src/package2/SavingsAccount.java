package package2; 
import package1.*; 

public class SavingsAccount extends  Account { 
    double intrate; 
    SavingsAccount(double balance,double rate){ 
        super.balance=balance; 
        intrate=rate; 

    } 
public double calculateInterest(){ 
        return(intrate*super.balance); 

    } 


}
