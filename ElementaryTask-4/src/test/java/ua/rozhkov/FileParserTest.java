package ua.rozhkov;

import static org.junit.Assert.assertEquals;

public class FileParserTest {

    FileParser fileParser;
    //	String fileSource="../test/resources/search.txt";
    String fileSource = String.valueOf(getClass().getResource("search.txt"));

    @org.junit.Before
    public void setUp() throws Exception {
        fileParser = new FileParser();
        fileParser.resetFile(fileSource);
    }

    @org.junit.Test
    public void parseFileForCounting() throws Exception {
        int expected = 2;
        int actual = fileParser.parseFile(fileSource, "маму");
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void parseFileForReplacing() throws Exception {
        int expected = 3;
        fileParser.parseFile(fileSource, "мама", "маму");
        int actual = fileParser.parseFile(fileSource, "маму");
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void resetFile() throws Exception {
        int expected = 1;
        int actual = fileParser.parseFile(fileSource, "мама");
        assertEquals(expected, actual);
    }

}