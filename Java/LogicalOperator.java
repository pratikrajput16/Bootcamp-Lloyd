import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("Do you have ID card? (true/false)");
        boolean flag=sc.nextBoolean();

        if((age>=18) && (flag)){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }

        sc.close();
    }
}
