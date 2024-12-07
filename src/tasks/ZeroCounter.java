package tasks;

import java.util.Random;
import java.util.Arrays;

public class ZeroCounter {
    public static void getNumbers() {
        int arrayLength = new Random().nextInt(100) + 1;
        System.out.println("[T3] n = " + arrayLength + ": " + Arrays.toString(generateZeroSumArray(arrayLength)));
    }

    public static int[] generateZeroSumArray(int arrayLength) {
        int[] result = new int[arrayLength];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < arrayLength - 1; i++) {
            int num;
            boolean isUnique;

            do {
                num = random.nextInt();
                isUnique = true;

                for (int j = 0; j < i; j++) {
                    if (result[j] == num) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            result[i] = num;
            sum += num;
        }

        result[arrayLength - 1] = -sum;
        return result;
    }
}
