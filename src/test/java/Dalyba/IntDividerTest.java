package Dalyba;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntDividerTest {
    @Test
    public void testDivisionBetweenEightAndTwo() throws ArgumentIsZeroException {
//        1. Duomenys
//        2. atliekam veiksmus
//        3. sulyginam gautus rezultatus

        String pirmasSkaicius = "8";
        String antrasSkaicius = "2";
        int expectedResult = 4;
        int actualResult;
        String[] skaiciai = {pirmasSkaicius, antrasSkaicius};
        actualResult = IntDivider.divide(skaiciai);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivision02() {

        String expected = "Povilas";
        String actual;
        actual = "Mano vardas yra Povilas";

        String resultInfo = String.format(
                "Expected: %s; Actual: %s",
                expected,
                actual
        );
        Assert.assertTrue(resultInfo, actual.contains(expected));
    }
}