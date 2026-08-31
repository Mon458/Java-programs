import java.util.Random;
class Q29 {
    public static void main(String[] args) {
        Random r = new Random();

        while (true) {
            int n = r.nextInt(100) + 1;

            System.out.println("Number = " + n);

            if (n % 7 == 0 && n % 13 == 0) {
                System.out.println("Found = " + n);
                break;
            }
        }
    }
}
