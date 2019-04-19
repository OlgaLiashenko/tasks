package tasks.taskTwo;

public class WordCounter implements Counter {
    private int result = 0;

    @Override
    public void readLine(String line) {
        if (line == null || line == "") {
            result = 0;
        } else {
            line = line.trim();
            String[] array = line.split("\\s+");
            result += array.length;
        }
    }

    @Override
    public int getResult() {
        return result;
    }
}
