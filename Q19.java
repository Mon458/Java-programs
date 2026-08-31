class Q19 {
    public static void main(String[] args) {

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int d = temp % 10;
                sum = sum + d * d * d;
                temp = temp / 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}
