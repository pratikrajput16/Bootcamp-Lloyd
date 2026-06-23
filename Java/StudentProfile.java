import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your height (in m):");
        double height = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter your favorite football club:");
        String favClub = sc.nextLine();

        System.out.println("Enter your CGPA:");
        double CGPA = sc.nextDouble();


        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Favorite Club: "+favClub);
        System.out.println("CGPA: "+CGPA);

        sc.close();
    }
}
