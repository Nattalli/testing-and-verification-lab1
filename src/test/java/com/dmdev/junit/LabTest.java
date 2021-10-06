package com.dmdev.junit;

import com.dmdev.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import java.io.IOException;

public class LabTest {

    String text;

    @BeforeEach
    public void SetUp()
    {
        text = "I love cats, they so cuuuute!!!";
    }
    @Test
    public void MaxWorld()
    {
        String max_length = "cuuuute";
        String world = Main.TheLongestWorld(text);
        Assertions.assertEquals(max_length, world);
    }

    @BeforeAll
    public void SetUp2() throws IOException
    {
        text = Main.FileReading("","C:\\Users\\Наталия\\Desktop\\test-forbeforeeach");
    }
    @Test
    public void IsEqual()
    {
        String text2 = "one 2 two years natali lovecats";
        Assertions.assertEquals(text, text2);
    }

    @Test
    public void Same()
    {
        String text2 = "This is something else";
        Assertions.assertNotSame(text, text2, "Test is successful! Strings is not equal.");
    }

    @Test
    public void IfEqual()
    {
        String longest_world = Main.TheLongestWorld(text);
        Boolean equal = longest_world.equals("lovecats");
        Assertions.assertTrue(equal);
    }

    @Test
    public void Substring()
    {
        String str = Main.WordSubstring("IWriteHereMoreThan30SymbolsToHaveAtTheEndLengthOfThisStringEqualTo30");
        Assertions.assertEquals(30, str.length());
    }

    @Test
    public void FilePath()
    {
        String path = Main.FilePath();
        Assertions.assertNull(path);
    }

    @ParameterizedTest
    public void testIsEqual(int number) {
        String str = Main.WordSubstring("IWriteHereMoreThan30SymbolsToHaveAtTheEndLengthOfThisStringEqualTo30");
        Assertions.assertEquals(true, str.length() == 30);
    }

    @Test
    public void HamcrestUsing1()
    {
        String text2 = "one 2 two years natali lovecats";
        assertThat(text, equalTo(text2));
    }

    @Test
    public void HamcrestUsing2()
    {
        String str = Main.WordSubstring("IWriteHereMoreThan30SymbolsToHaveAtTheEndLengthOfThisStringEqualTo30");
        assertThat(str.length(), equalTo(30));;
    }

}
