import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        int percentage=sc.nextInt();

        if(percentage>=90 && percentage<=100){
            System.out.println("Excellent");
        }else if(percentage>=75 && percentage<=89){
            System.out.println("Very Good");
        }else if(percentage>=60 && percentage<=74){
            System.out.println("Good");
        }else if(percentage>=40 && percentage<=59){
            System.out.println("Pass");
        }else if(percentage>=0 && percentage<=39){
            System.out.println("Fail");
        }else{
            System.out.println("Invalid Percentage");
        }

        sc.close();
    }
}
