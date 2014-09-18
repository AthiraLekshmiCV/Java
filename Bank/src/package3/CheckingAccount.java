package package3; 
import package1.*; 

public class CheckingAccount extends Account{ 
    double fee_transaction; 
    public CheckingAccount(){ 
    
    } 
    public CheckingAccount(double b){ 
        super.balance=b; 
    } 
    public CheckingAccount(double balance,double fee){ 
        super.balance=balance; 
        fee_transaction=fee; 

    } 
    @Override
   public  void credit(double am){ 
    super.credit(am); 
    super.balance-=fee_transaction; 
    System.out.println("Fee charged" + fee_transaction + "And the final balance is" + super.balance); 


    } 
    @Override
    public boolean debit(double am){ 
        if(super.debit(am)){ 
            super.balance-=fee_transaction; 
            System.out.println("Fee charged" + fee_transaction + "And the final balance is" + super.balance); 
            return true; 
        } 
         else{ 
            return false; 
         } 



    } 

}


