package October_12_2023;

public class ReturnArrays {
    public static int[] plusOne(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] + 1;
        }

        return B;
    }

    public static void main(String[] args) {
        // Create an arry for A with 3 objects
        int[] A = { 10, 20, 30 };
        // Initialize empty array for B
        int[] B;

        B = plusOne(A);
        System.out.println(A[0]);
        System.out.println(B[0]);
    }
}
