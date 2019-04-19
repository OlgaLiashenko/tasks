package tasks.taskTwo;

public class LineCounter implements Counter {
    private int result = 0;

    @Override
    public void readLine(String line) {
        if (line == null) {
            result = 0;

        }

        else {
            result = result + 1;
        }
    }

    @Override
    public int getResult() {
        return result;
    }
}

// problem with null string in end, in test is ok