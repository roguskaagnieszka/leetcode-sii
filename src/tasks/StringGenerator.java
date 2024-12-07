package tasks;

public class StringGenerator {
    public static void getSigns(int n) {
        System.out.println(drawSigns(n));
    }
    
    public static String drawSigns(int n) {
        String result = "[T1] n = 4: ";

        for (int i = 0; i < n; i++) {
            result += (i % 2 == 0) ? "+" : "-";
        }
        return result;
    }
}
