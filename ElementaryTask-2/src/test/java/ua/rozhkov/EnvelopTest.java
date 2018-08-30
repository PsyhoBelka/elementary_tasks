package ua.rozhkov;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnvelopTest {

    @Test
    public void square() throws Exception {

        Envelop envelop = new Envelop(3, 5);
        assertEquals(15, (int) envelop.square());
    }

    @Test
    public void compareEnvFalse() throws Exception {

        Envelop envelop1 = new Envelop(4, 5);
        Envelop envelop2 = new Envelop(3, 6);
        assertFalse(envelop1.compareEnv(envelop2));
    }

    @Test
    public void compareEnvTrue() throws Exception {

        Envelop envelop1 = new Envelop(4, 5);
        Envelop envelop2 = new Envelop(5, 7);
        assertTrue(envelop2.compareEnv(envelop1));
    }

}