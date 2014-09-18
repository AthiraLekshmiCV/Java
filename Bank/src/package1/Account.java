package package1; 


public class Account{ 

   public double balance; 
    public Account(){ 
        balance=0; 
    } 
    public Account(double a){ 
        if(a<0){ 
               balance=a; 
               System.out.println("Invalid balance"); 
        } 
        else 
            balance=a; 
    } 
   public  void credit(double amount){ 

        balance+=amount; 
        System.out.println("The current balance is" + balance); 
    } 
    public boolean debit(double amount){ 

        if(amount>balance){ 
            System.out.println("Debit amount exceeded account's balance"); 
            return false; 
        } 
        else{ 
            balance-=amount; 
            System.out.println("The current balance is" + balance); 
            return true; 
        } 

    } 
    public double getbalance(){ 
        return balance; 
    } 

}