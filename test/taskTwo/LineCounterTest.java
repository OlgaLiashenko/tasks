package taskTwo;

import org.junit.Assert;
import org.junit.Test;
import tasks.taskTwo.CharacterCounter;
import tasks.taskTwo.LineCounter;

public class LineCounterTest {


    @Test
    public void OneLine() {
        //given
        LineCounter counter = new LineCounter();
        //when
        counter.readLine("1");
        //then
        Assert.assertEquals(1, counter.getResult());
    }


    @Test
    public void OneEmptyLine() {
        //given
        LineCounter counter = new LineCounter();
        //when
        counter.readLine("");
        //then
        Assert.assertEquals(1, counter.getResult());
    }


    @Test
    public void firstEmptyLine() {

        //given
        String[] inputLines = {"", "12", "h  g"};
        LineCounter counter = new LineCounter();

        //when
        for (String line : inputLines) {
            counter.readLine(line);
        }

        //then
        Assert.assertEquals(3, counter.getResult());
    }

    @Test
    public void checkNull() {
        //given
        LineCounter counter = new LineCounter();
        //when
        counter.readLine(null);
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void checkEmptyStringInMiddle() {
        //given
        String[] inputLines = {"1", "", "3", "4"};
        LineCounter counter = new LineCounter();

        //when
        for (String line : inputLines) {
            counter.readLine(line);
        }

        //then
        Assert.assertEquals(4, counter.getResult());
    }

    // problem in method with empty str in end, in test is ok
    @Test
    public void checkEmptyStringInEnd() {
        //given
        String[] inputLines = {"1", "2", "3", "",""};
        LineCounter counter = new LineCounter();

        //when
        for(String line : inputLines){
            counter.readLine(line);
        }

        //then
        Assert.assertEquals(5, counter.getResult());
    }
}
// problem with null string in end, in test is ok