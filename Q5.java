import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Negative value = " + (-n));

        sc.close();
    }
}
