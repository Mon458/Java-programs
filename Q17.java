import java.util.Scanner;
class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = (n << 2) | (n >>> 30);

        System.out.println("After left rotation = " + result);

        sc.close();
    }
}
