package bankie;
import java.util.Scanner;
interface ATM{
    void withdraw(double amount);
    void deposit(double depo);
    void check_balance();
}

class Bank_account implements ATM{
    Double balance=0.0;
    @Override
    public void withdraw(double amount) {
        if ((balance-amount)<0){
            System.out.println("insufficient balance... kindly  deposit  money ");
        }
        else{
            balance=balance-amount;
            System.out.println(amount+" has been WITHDRAWED");
        }
    }

    @Override
    public void deposit(double depo) {
        balance=balance+depo;
        System.out.println(depo +" has been DEPOSITED ");
    }
    @Override
    public void check_balance() {
        System.out.println("current bank balance is "+balance);
    }
}

public class ATM_machine extends Bank_account {


    public static void main(String[] args) {
        ATM_machine obj1=new ATM_machine();
        Scanner input=new Scanner(System.in);


        for( int i=0;i<100;i++){
            System.out.println();
            System.out.println();
            System.out.println("Enter the action that need to be performed ");
            System.out.println("Press D to deposit  ");
            System.out.println("Press W to withdraw ");
            System.out.println("Press  C to check balance ");
            System.out.println("Press  E to exit ");
            char action=input.next().charAt(0);
        if(action=='d'||action=='D'){
            System.out.println("Enter the amount to be deposited : ");
            double depo=input.nextDouble();
            obj1.deposit(depo);
        }
        else if(action=='W'||action=='w'){
            System.out.println("Enter the amount to be withdrawed : ");
            double amount=input.nextDouble();
            obj1.withdraw(amount);
        }
        else if (action=='C'||action=='c'){
        obj1.check_balance();}
        else if(action=='E'||action=='e'){
            System.out.println("THANK YOU!...");
            break;}
        else{
            System.out.println("PLZZ ENTER CORRECT ACTION!");
        }

    }}
}
