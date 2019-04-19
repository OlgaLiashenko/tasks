package taskTwo;

import org.junit.Assert;
import org.junit.Test;
import tasks.taskTwo.WordCounter;

public class WordCounterTest {

    @Test
    public void oneWord() {
        //given
        WordCounter counter = new WordCounter();
        //when
        counter.readLine("one");
        //then
        Assert.assertEquals(1, counter.getResult());
    }

    @Test
    public void emptyString() {
        //given
        WordCounter counter = new WordCounter();
        //when
        counter.readLine("");
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void checkNull() {
        //given
        WordCounter counter = new WordCounter();
        //when
        counter.readLine(null);
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void wordsWithSpecialCharacters() {
        //given
        WordCounter counter = new WordCounter();
        //when
        counter.readLine(" one * plus _ == ... ");
        //then
        Assert.assertEquals(6, counter.getResult());
    }

    @Test
    public void multipleWhiteSpaces() {
        //given
        WordCounter counter = new WordCounter();
        //when
        counter.readLine("   one *  plus _    ==    ");
        //then
        Assert.assertEquals(5, counter.getResult());
    }
}
