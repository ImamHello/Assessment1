import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    @Test
    public void testint20() {
	int Arg1 = 20;
        assertEquals("Testing Dec2Hex with a value of 20 answer should be 14", "14", dec2Hex.DecimalConvert(Arg1));
    }

    @Test
    public void teststringinput() {
	String Arg1 = "180";
        assertEquals("Testing Dec2Hex with a value of 180 input as a string the answer should be isstring because its a string and the user shouldn't be entering in a string", "isstring", dec2Hex.DecimalConvert(Arg1));
    }

    @Test
    public void Noinput() {
        assertEquals("Calling the decimal converter with no input", "Ran into a problem", dec2Hex.DecimalConvert());
    }
    @Test
    public void Nonintinput() {
        assertEquals("Calling the decimal converter with another non int input", "isstring", dec2Hex.DecimalConvert(2.5));
    }
}
