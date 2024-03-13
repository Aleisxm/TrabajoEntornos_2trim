import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicarTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void mult1() {
        double sum1 = 2;
        double sum2 = 4;
        double expResul = 8;
        double result = Multiplicar.Multiplicar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void mul2() {
        double sum1 = 10;
        double sum2 = 2;
        double expResul = 20;
        double result = Multiplicar.Multiplicar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void mul3() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 4;
        double result = Multiplicar.Multiplicar(sum1, sum2);
        assertEquals(expResul, result);
    }
}