import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Rainfall day " + i + ": ");
            double rain = sc.nextDouble();
            total += rain;
        }

        System.out.println("Total rainfall = " + total);

        sc.close();
    }
}
