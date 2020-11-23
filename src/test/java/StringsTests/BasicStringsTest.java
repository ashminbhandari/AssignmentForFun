package StringsTests;

import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.

public class BasicStringsTest {
    private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcatTest1(){
        String string1 = " Inverted";
        String string2 = "String";
        String expected = "String Inverted";
        String actual = basicStrings.flipConcat(string1, string2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest2(){
        String string1 = "STOP";
        String string2 = "IMMEDIATE";
        String expected = "IMMEDIATESTOP";

        String actual = basicStrings.flipConcat(string1, string2);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void flipConcatTest3(){
        String string1 = "HERO!";
        String string2 = "It's a me! ";
        String expected = "It's a me! HERO!";

        String actual = basicStrings.flipConcat(string1, string2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest1(){
        String string1 = "LET US PARTY";
        char expected = 'U';

        char actual = basicStrings.getChar(string1, 4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest2(){
        String string1 = "You can do this!";
        char expected = ' ';

        char actual = basicStrings.getChar(string1, 3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest1(){
        String string1 = "caters";
        String expected = "      ";

        String actual = basicStrings.iCantSee(string1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest2(){
        String string1 = "I Can-t Do It";
        String expected = "             ";

        String actual = basicStrings.iCantSee(string1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest3(){
        String string1 = "";
        String expected = "";

        String actual = basicStrings.iCantSee(string1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest1(){
        String string = "";
        String expected = "";

        String actual = basicStrings.loudAndClear(string);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest2(){
        // Given
        String string = "leT us PARTY";
        String expected = "LET US PARTY";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest1(){
        // Given
        String string = "LETsS DANCE";
        String expected = "letSs dance";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest2(){
        // Given
        String string = "i love yall";
        String expected = "I LOVE YALL";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest3(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest(){
        // Given
        String string1 = "";
        String string2 = "";
        String expected = "";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest2(){
        // Given
        String string1 = "W abs";
        String string2 = "ed et";
        String expected = "We da best";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest3(){
        // Given
        String string1 = "Chr 9.0";
        String string2 = "oot";
        String expected = "Cohort 9.0";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
}
