package ua.rozhkov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void toStringTest() throws Exception {
        Triangle triangle = new Triangle();
        triangle.setName("123");
        assertEquals("[123]: 0,00", triangle.toString());
    }

    @Test
    public void square() throws Exception {
        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(6);
        assertEquals(String.format("%.2f", 5.33), String.format("%.2f", triangle.square()));
    }

}