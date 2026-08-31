class Q24 {
    public static void main(String[] args) {
        int[] a = {10, 5, 25, 8, 15};

        int max = a[0];
        int min = a[0];

        for (int n : a) {
            if (n > max)
                max = n;

            if (n < min)
                min = n;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
