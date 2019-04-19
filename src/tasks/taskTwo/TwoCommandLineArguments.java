package tasks.taskTwo;
//1. Change the program to accept two command line arguments. First one should be one of ‘-w’, ‘-l’, ‘-c’,
// which is the flag determining what should be counted.
//2. Create a `Counter` interface with two methods `readLine(String line)` and `getResult()`.
//3. Create a separate classes for all types of counters (e.g. `WordCounter.java`, `LineCounter.java` etc.).
// All of them have to implement the `Counter` interface.

import tasks.taskOne.TaskOneWordCounterFromFileFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TwoCommandLineArguments {
    public static void main(String[] args) {

        String flag = args[0];
        String filename = args[1];
        Counter counter = CounterFactory.createCounter(flag);
        int lineNum = 1;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line = reader.readLine();
            System.out.println(lineNum++ + "|" + line);

            while (line != null) {
                counter.readLine(line);
                line = reader.readLine();
                System.out.println(lineNum++ + "|" + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getResult());
    }
}

// problem with null string in end, in test is ok