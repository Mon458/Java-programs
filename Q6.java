import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double n = sc.nextDouble();

        int count = 0;

        while (n >= 1) {
            n /= 2;
            count++;
        }

        System.out.println("Number of steps = " + count);

        sc.close();
    }
}
