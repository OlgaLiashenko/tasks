package tasks.taskOne;
//Write a simple utility in Java that is similar to wc (word count) Unix tool.
//Program should take 1 command line argument, the name of the file; and print to the screen number of words in this file.
//Word is a sequence of non-whitespace characters surrounded by some whitespace characters.


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TaskOneWordCounterFromFile {

    public static void main(String[] args) {
        String filename;

        if (args.length > 0) {
            filename = args[0];
        } else {
            filename = "test.txt";
        }
        TaskOneWordCounterFromFileFunction wordCounter = new TaskOneWordCounterFromFileFunction();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line = reader.readLine();
            while (line != null) {
                wordCounter.readLine(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(wordCounter.getResult());
    }

    /*
    public static int countWords(String input){
        if(input == null || input.isEmpty()){
            return 0;
        }
        input = input.trim();
        String[] arrayOfWords = input.split("\\s+"); //splits the string based on whitespace
        return arrayOfWords.length;
    }
     */
}
