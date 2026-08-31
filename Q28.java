class Q28 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i == 1 || i == 4 || i == 9 || i == 16 ||
                i == 25 || i == 36 || i == 49)
                continue;

            System.out.print(i + " ");
        }
    }
}
