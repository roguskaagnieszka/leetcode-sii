package tasks;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SiblingFinder {
    public static void getLargestSibling() {
        int firstSibling = new Random().nextInt(10_000) + 1;
        int largestSibling = findLargestSibling(firstSibling);

        System.out.println("[T4] The largest sibling of the number " + firstSibling + " is " + largestSibling);
    }

    public static int findLargestSibling(int firstSibling) {
        String digits = Integer.toString(firstSibling);
        Set<String> siblingsSet = new HashSet<>();
        findPermutationsHelper("", digits, siblingsSet);

        int currentMax = 0;
        for (String sibling : siblingsSet) {
            int potentialMax = Integer.parseInt(sibling);
            currentMax = Math.max(currentMax, potentialMax);
        }
        return currentMax;
    }

    private static void findPermutationsHelper(String prefix, String remaining, Set<String> siblingsSet) {
        if (remaining.isEmpty()) {
            siblingsSet.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                findPermutationsHelper(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        siblingsSet);
            }
        }
    }
}