import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter second number");
        int b=sc.nextInt();

        System.out.println("Equal: "+(a==b));
        System.out.println("Not equal: "+(a!=b));
        System.out.println("Greater: "+(a>b));
        System.out.println("Less: "+(a<b));
        System.out.println("Greater or equal: "+(a>=b));
        System.out.println("Less or equal: "+(a<=b));

        sc.close();
    }
}
