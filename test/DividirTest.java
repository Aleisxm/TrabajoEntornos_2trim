import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void div() {
        double sum1 = 20;
        double sum2 = 2;
        double expResul = 10;
        double result = Dividir.Dividir(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void div1() {
        double sum1 = 10;
        double sum2 = 2;
        double expResul = 5;
        double result = Dividir.Dividir(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void div2() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 1;
        double result = Dividir.Dividir(sum1, sum2);
        assertEquals(expResul, result);
    }
}