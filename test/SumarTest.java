import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumarTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumar() {
        double sum1 = 1;
        double sum2 = 2;
        double expResul = 3;
        double result = Sumar.Sumar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void sumar1() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 4;
        double result = Sumar.Sumar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void sumar2() {
        double sum1 = 3;
        double sum2 = 2;
        double expResul = 5;
        double result = Sumar.Sumar(sum1, sum2);
        assertEquals(expResul, result);
    }
}