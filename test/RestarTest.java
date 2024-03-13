import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestarTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void restar1() {
        double sum1 = 2;
        double sum2 = 1;
        double expResul = 1;
        double result = Restar.Restar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void restar2() {
        double sum1 = 10;
        double sum2 = 2;
        double expResul = 8;
        double result = Restar.Restar(sum1, sum2);
        assertEquals(expResul, result);
    }

    @Test
    void restar3() {
        double sum1 = 2;
        double sum2 = 2;
        double expResul = 0;
        double result = Restar.Restar(sum1, sum2);
        assertEquals(expResul, result);
    }
}