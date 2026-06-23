import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Current balance
        System.out.println("Enter current balance: ");
        double balance=sc.nextDouble();

        //Withdrawal amount
        System.out.println("Enter withdraw amount: ");
        double withdraw=sc.nextDouble();

        //Check balance
        if(balance>=withdraw){
            balance=balance-withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining amount: "+balance);
        }else{
            System.out.println("Withdrawal unsuccessful");
            System.out.println("Current amount: "+balance);
        }
        sc.close();
    }
}
