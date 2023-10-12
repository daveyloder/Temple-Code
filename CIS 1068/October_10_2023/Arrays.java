package October_10_2023;

public class Arrays {

    public static void main(String[] args) {
        int[] grades = new int[3];
        double sum = 0.0;
        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 95;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        System.out.println("avg= " + sum / grades.length);
    }
}
