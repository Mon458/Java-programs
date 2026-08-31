import java.util.Scanner;
class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int x = n;
        boolean powerOf4 = true;

        while (x > 1) {
            if ((x & 3) != 0) {
                powerOf4 = false;
                break;
            }
            x = x >> 2;
        }

        System.out.println("Power of 4 = " + powerOf4);

        int toggle = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit = " + toggle);

        for (int i = 1; i <= 10; i++) {
            int result = n * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
