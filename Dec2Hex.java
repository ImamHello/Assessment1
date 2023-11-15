import static org.junit.Assert.assertEquals;

public class Dec2Hex {

    public String DecimalConvert() {
        System.out.println("Ran into a problem");
        return ("Ran into a problem");
    }

    static String DecimalConvert(Object input) {
        try {
            boolean ff;
            String f = "";
            System.out.println(input.getClass().getSimpleName());
            System.out.println(f.getClass().getSimpleName());
            if (input.getClass().getSimpleName() == f.getClass().getSimpleName()) {
                System.out.println("bark bark bark ohwous");
            }
            ff = assertEquals("Testing Dec2Hex with a value of 20 answer should be 14", f.getClass().getSimpleName(),
                    input.getClass().getSimpleName());

            String strconverted = input.toString();
            int intconverted = Integer.parseInt(strconverted);

            char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
            int rem, num;
            num = intconverted;
            String hexadecimal = "";

            System.out.println("Converting the Decimal Value " + num + " to Hex...");
            if (num == 0) {
                System.out.println("Hexadecimal representation is: 0");
            } else {
                while (num != 0) {
                    rem = num % 16;
                    hexadecimal = ch[rem] + hexadecimal;
                    num = num / 16;
                }
                System.out.println("Hexadecimal representation is: " + hexadecimal);
            }

            return (hexadecimal);
        } catch (Exception e) {
            return ("Ran into a problem");
        }
    }

    public static void main(String args[]) {
        DecimalConvert(20);
        DecimalConvert("20");

    }
}
