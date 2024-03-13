import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class operacionesTest {

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
        double result = operaciones.Sumar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void sumar1() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 4;
        double result = operaciones.Sumar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void sumar2() {
        double sum1 = 3;
        double sum2 = 2;
        double expResul = 5;
        double result = operaciones.Sumar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void restar1() {
        double sum1 = 2;
        double sum2 = 1;
        double expResul = 1;
        double result = operaciones.Restar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void restar2() {
        double sum1 = 10;
        double sum2 = 2;
        double expResul = 8;
        double result = operaciones.Restar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void restar3() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 0;
        double result = operaciones.Restar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void mult1() {
        double sum1 = 2;
        double sum2 = 4;
        double expResul = 8;
        double result = operaciones.Multiplicar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void mul2() {
        double sum1 = 10;
        double sum2 = 2;
        double expResul = 20;
        double result = operaciones.Multiplicar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void mul3() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 4;
        double result = operaciones.Multiplicar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void div() {
        double sum1 = 20;
        double sum2 = 2;
        double expResul = 10;
        double result = operaciones.Dividir(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void div1() {
        double sum1 = 10;
        double sum2 = 2;
        double expResul = 5;
        double result = operaciones.Dividir(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void div2() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 1;
        double result = operaciones.Dividir(sum1, sum2);
        assertEquals(expResul, result);
    }
}