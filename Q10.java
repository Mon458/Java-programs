import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
                && year >= 2000 && year <= 2030)
            System.out.println("Leap year and within range");
        else
            System.out.println("Condition not satisfied");

        sc.close();
    }
}