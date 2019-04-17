package tasks.taskOne;

public class TaskOneWordCounterFromFileFunction {
    private int result = 0;

    public void readLine(String input) {
        input = input.trim();
        String[] arrayOfWords = input.split("\\s+"); //splits the string based on whitespace
        result += arrayOfWords.length;
    }

    public int getResult() {
        return result;
    }
}
