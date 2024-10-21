
import java.util.Scanner;
class uba{
    int cb=20000;
    void checkbal()
    {System.out.println("your current balance is=$"+cb);
    }
    void deposit(int amt) {
        cb=cb+amt;
        System.out.println(" Successfully deposited $"+ amt);
    }
    void withdraw(int amt) { if(cb<=0)
    {System.out.println("your current balance is $0 !! you can't withdraw money");}
    else if(amt>cb){
        System.out.println("! Insufficient Balance !");
    }
    else
    {  cb=cb-amt;
        System.out.println("Collect your money $"+amt);}
    }
}
public class ATMinterface extends uba {
    public static void main(String[] args) {  Scanner ob=new Scanner(System.in);
        ATMinterface a=new ATMinterface();
        System.out.println("\t ------ATM INTERFACE-----");
        while(true)
        {  System.out.println("Hello user!! Select one of the options given below-->");
            System.out.println("1.\t check balance\n2. \t deposit\n3. \t withdraw\n4. \t exit");
            System.out.print("Enter your choice=");
            int ch=ob.nextInt();
            switch(ch){
                case 1:
                    a.checkbal();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:$");
                    int amt=ob.nextInt();
                    if(amt>=0)
                    {a.deposit(amt);}
                    else {
                        System.out.println("Invalid amount .Please enter a positive value");}
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw:$");
                    int am=ob.nextInt();
                    if(am>=0)
                    { a.withdraw(am);}
                    else {
                        System.out.println("Invalid amount .Please enter a positive value");}
                    break;
                case 4:
                    System.out.println("--Thanks for using ATM machine--");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please ,choose a valid option");
                    break;
            }}

    }
}
