import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @DisplayName("Adding two numbers using BigInteger")
    @Test
    void sumStrings() {
        assertEquals("4002235285176798", Kata.sumStringsWithBig("573775", "4002235284603023"));
        assertEquals("4690", Kata.sumStringsWithBig("123", "4567"));
        assertEquals("7606004275776948", Kata.sumStringsWithBig("337417013728", "7605666858763220"));
        assertEquals("8113857314043165630563495000607", Kata.sumStringsWithBig("38544163741124536104", "8113857314004621466822370464503"));
    }

    @DisplayName("Adding a number plus an empty string using BigInteger")
    @Test
    void sumOfOneStringAndAnEmptyString() {
        assertEquals("123", Kata.sumStringsWithBig("123", ""));
        assertEquals("123", Kata.sumStringsWithBig("", "123"));
    }



    @Test
    void noNullsInTheBeginningTest(){
        assertEquals("7", Kata.noNullsInTheBeginning("007"));
        assertEquals("47", Kata.noNullsInTheBeginning("47"));
        assertEquals("800", Kata.noNullsInTheBeginning("0800"));
        assertEquals("337417013728", Kata.noNullsInTheBeginning("337417013728"));
        assertEquals("3374170137208", Kata.noNullsInTheBeginning("3374170137208"));
        assertEquals("88142282644", Kata.noNullsInTheBeginning("088142282644"));
        assertEquals("10367", Kata.noNullsInTheBeginning("10367"));

    }

    @Test
    void startsWithNullTest(){
        assertTrue(Kata.startsWithNull("0123"));
        assertTrue(Kata.startsWithNull("00123"));
        assertTrue(Kata.startsWithNull("001203"));
    }

    @Test
    void sumTest(){

        assertEquals("1000", Kata.sum("600", "400"));
        assertEquals("2000", Kata.sum("600", "1400"));
        assertEquals("8113857314043165630563495000607", Kata.sum("38544163741124536104", "8113857314004621466822370464503"));
        assertEquals("8", Kata.sum("1", "007"));
        assertEquals("8", Kata.sum("00001", "007"));

        assertEquals("579", Kata.sum("123", "456"));

        assertEquals("8113857314043165630563495000607", Kata.sum("38544163741124536104", "8113857314004621466822370464503"));
        assertEquals("6197", Kata.sum("500", "5697")); //jó
        assertEquals("1100", Kata.sum("900", "200")); //jó
        assertEquals("11000", Kata.sum("9800", "1200")); //jó
        assertEquals("6097", Kata.sum("400", "5697"));
        assertEquals("10367", Kata.sum("800", "9567"));
        assertEquals("10456", Kata.sum("700", "9756"));
        assertEquals("1088", Kata.sum("100", "988")); // jó
        assertEquals("1030", Kata.sum("80", "950")); // jó
        assertEquals("14600", Kata.sum("600", "14000"));
        assertEquals("14834", Kata.sum("600", "14234"));
        assertEquals("15133", Kata.sum("899", "14234"));
    }
}