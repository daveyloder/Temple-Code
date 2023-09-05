package September_5_2023;

public class ForLoops {
    public static void main(String[] args) {
        // For loop basic. Prints i variable 5 times
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        /*
         * illegal. this doesn't work
         * i is "local" to the for loop
         * it is "out of scope" here
         */
        // System.out.println("Loop's finished. i is now" + i);

    }
}
