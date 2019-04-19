package taskTwo;

import org.junit.Assert;
import org.junit.Test;
import tasks.taskTwo.CharacterCounter;

public class CharacterCounterTest {

    @Test
    public void oneCharCounter() {
        //given
        CharacterCounter counter = new CharacterCounter();
        //when
        counter.readLine("1");
        //then
        Assert.assertEquals(1, counter.getResult());
    }

    @Test
    public void checkNull() {
        //given
        CharacterCounter counter = new CharacterCounter();
        //when
        counter.readLine(null);
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void checkWhiteSpace() {
        //given
        CharacterCounter counter = new CharacterCounter();
        //when
        counter.readLine(" ");
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void checkEmptyStringe() {
        //given
        CharacterCounter counter = new CharacterCounter();
        //when
        counter.readLine("");
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void specialCharacters(){
        //given
        CharacterCounter counter = new CharacterCounter();
        //when
        counter.readLine(" ? i % / 2., ");
        //then
        Assert.assertEquals(7, counter.getResult());
    }
}
