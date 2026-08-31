class Q25 {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 70, 90},
            {60, 75, 85}
        };

        int sum = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                sum += mark;
                count++;
            }
        }

        System.out.println("Average = " + (double) sum / count);
    }
}
