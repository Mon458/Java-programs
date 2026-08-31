import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Theory marks: ");
        int theory = sc.nextInt();

        System.out.print("Practical marks: ");
        int practical = sc.nextInt();

        System.out.print("Overall percentage: ");
        int overall = sc.nextInt();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Student Passes");
        else
            System.out.println("Student Fails");

        sc.close();
    }
}
