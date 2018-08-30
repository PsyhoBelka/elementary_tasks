package ua.rozhkov;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DigitSeqTest {

    DigitSeq digitSeq;

    @BeforeMethod
    public void setUp() throws Exception {
        digitSeq = new DigitSeq();
    }

    @DataProvider(name = "printSeqData")
    public Object[][] testData() {
        return new Object[][]{
                {"1", "25", "36"},
                {"2", "25", "36, 49"},
                {"5", "25", "36, 49, 64, 81, 100"}
        };
    }

    @Test(dataProvider = "printSeqData")
    public void testPrintSeq(String length, String maxSqr, String expected) throws Exception {
        String actual = digitSeq.printSeq(length, maxSqr);
        assertEquals(expected, actual);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testPrintSeq_Exception() {
        digitSeq.printSeq("drdbt", "23");
    }

}