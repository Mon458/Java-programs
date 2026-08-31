import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        min = (min < d) ? min : d;

        System.out.println("Smallest = " + min);

        sc.close();
    }
}
