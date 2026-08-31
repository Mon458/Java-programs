import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        int i = 0;

        while (i < a.length() && i < b.length()) {
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println(a + " comes before " + b);
                return;
            }

            if (a.charAt(i) > b.charAt(i)) {
                System.out.println(a + " comes after " + b);
                return;
            }

            i++;
        }

        if (a.length() < b.length())
            System.out.println(a + " comes before " + b);
        else if (a.length() > b.length())
            System.out.println(a + " comes after " + b);
        else
            System.out.println("Both are equal");

        sc.close();
    }
}
