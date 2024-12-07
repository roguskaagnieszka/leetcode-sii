import tasks.*;

public class Main {
    public static void main(String[] args) {
        StringGenerator.getSigns(8);
        BugInCode.main();
        ZeroCounter.getNumbers();
        SiblingFinder.getLargestSibling();
        FirstCharCheck.main("Test");
    }
}