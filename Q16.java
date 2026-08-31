import java.util.Scanner;
class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Multiply by 8 = " + (n << 3));
        System.out.println("Divide by 4 = " + (n >> 2));

        sc.close();
    }
}
