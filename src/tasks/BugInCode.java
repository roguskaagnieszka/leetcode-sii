package tasks;

public class BugInCode {
    public static void main() {
        System.out.println("[T2] The sum of the numbers in the array is: "
        + calSumArray(new int[]{2_000_000_000, 1_000_000_000, -500_000_000}));
    }

    public static long calSumArray(int[] arr) { // Used long instead of int to avoid integer overflow for large sums
        long result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}
