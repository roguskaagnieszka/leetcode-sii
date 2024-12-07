package tasks;

public class FirstCharCheck {
    public static void main(String word) {
        System.out.println("[T5] The first character of the word " + word + " is " + repFirstChar(word) + ".");
    }

    public static String repFirstChar(String s) {
        char c = s.charAt(0);

        if (Character.isUpperCase(c)) {
            return "upper";
        } else if (Character.isLowerCase(c)) {
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }
    }
}
