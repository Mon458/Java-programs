import java.util.Scanner;
class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= '0' && ch <= '9') ? "Digit" :
                        (ch == 'a' || ch == 'e' || ch == 'i' ||
                         ch == 'o' || ch == 'u') ? "Vowel" :
                        (ch >= 'A' && ch <= 'Z' ||
                         ch >= 'a' && ch <= 'z') ? "Consonant" :
                        "Special Symbol";

        System.out.println(result);

        sc.close();
    }
}
