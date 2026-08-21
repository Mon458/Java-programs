import java.util.Scanner;

public class Program25LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (A/O/N): ");
        char op = sc.next().charAt(0);

        boolean result;

        if (op == 'A' || op == 'a') {
            result = (a > 0) && (b > 0);
            System.out.println("AND Result = " + result);
        } else if (op == 'O' || op == 'o') {
            result = (a > 0) || (b > 0);
            System.out.println("OR Result = " + result);
        } else if (op == 'N' || op == 'n') {
            result = !(a > 0);
            System.out.println("NOT Result = " + result);
        } else {
            System.out.println("Invalid Logical Operator");
        }
    }
}
