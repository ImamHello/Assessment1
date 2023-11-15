public class Dec2Hex {

// method with no inputs to  returns string and dispalys error message to console
    public String DecimalConvert() {
        System.out.println("No input Please enter an integer");
        return ("Ran into a problem");
    }

// creats a funtion that retunrs a string and takes in an object
    static String DecimalConvert(Object input) {
        try {
// checks to see the type of the passed in opbejct and error if it isn't some comoun types
            if (input instanceof String || input instanceof Double || input instanceof Float ) {
                System.out.println("You have entered a non integer");
                return ("isstring");
// prints error and returns string 
            } else {
// if it wasn't a none intiger then converts the varables so that into converted can set up num later
                String strconverted = input.toString();
                int intconverted = Integer.parseInt(strconverted);

                char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
                int rem, num;
                num = intconverted;
                String hexadecimal = "";
// setting up the char array and varables for the looping and the retunr hex sring
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
// loops throush the numbers while its not 0 and does the converting to hexidecimal and prints the hex value

                return (hexadecimal);
// returns the string 
            }

        } catch (Exception e) {
            return ("Ran into a problem");
        }// encase of error retunrs ran into a prroblem text
    }
}
