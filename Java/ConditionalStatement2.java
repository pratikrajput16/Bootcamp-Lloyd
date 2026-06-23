import java.util.Scanner;

public class ConditionalStatement2 {
    public static void main(String[] args) {
        String correctPassword="java123";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password=sc.nextLine();

        if(password.equals(correctPassword)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Incorrect Password");
        }
    }
}
