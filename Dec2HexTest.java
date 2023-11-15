import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// setting up imports for junit

// creating a public clas called Dec2HexTest
public class Dec2HexTest {

    public Dec2HexTest()
   {}
   // setting up the varable dec2Hex as type Dec2Hex
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        // making sure that dec2Hex is set to a new class Dec2Hex before the tests are ran 
        dec2Hex = new Dec2Hex();
    }

    // creats a test method called testint20 initulises varable Arg1 as an int and set it to 20 
    @Test
    public void testint20() {
	int Arg1 = 20;
    // using assertEquals with text describing the test the expected value and the actual value 
        assertEquals("Testing Dec2Hex with a value of 20 answer should be 14", "14", dec2Hex.DecimalConvert(Arg1));
    }

    // creats a test method called teststringinput initulises varable Arg1 as type String and set it to "180" 
    @Test
    public void teststringinput() {
	String Arg1 = "180";
        // using assertEquals with text describing the test the expected value and the actual value 
        assertEquals("Testing Dec2Hex with a value of 180 input as a string the answer should be isstring because its a string and the user shouldn't be entering in a string", "isstring", dec2Hex.DecimalConvert(Arg1));
    }

// creats a test method called Noinput passes in no input to the decimalConverte() function from the class dec2Hex 

    @Test
    public void Noinput() {
            // using assertEquals with text describing the test the expected value and the actual value 

        assertEquals("Calling the decimal converter with no input", "Ran into a problem", dec2Hex.DecimalConvert());
    }

    // creats a test method called Nonintinput which passes in the value 2.5 into the DecimalConvert function 

    @Test
    public void Nonintinput() {
            // using assertEquals with text describing the test the expected value and the actual value 
        assertEquals("Calling the decimal converter with another non int input", "isstring", dec2Hex.DecimalConvert(2.5));
    }
}
