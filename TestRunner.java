import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.lang.Exception;
// Setting up the imports


public class TestRunner {
    // creating class test runner
   public static void main(String[] args) {
    // main method
      Result result = JUnitCore.runClasses(Dec2HexTest.class);
      int fails = 0;
      // creating a counter for the number of fails and a result which is of type result and runs the Dec2HexTest.class
      try{
         // loops through the fails and increments the counter and prints a message to the terminal
          for (Failure failure : result.getFailures()) {
             System.out.println(failure.toString());
             fails++;
         }
         // checks to see if there are any fails if not then it prints the result using the method wasSuccessful 
          if(fails >0)
            throw  new Exception();
          System.out.println(result.wasSuccessful());
      }

      catch(Exception e)
      {
        // if there is an exeption the catch triggers and it prints the number of fails as well as some text and exits using (1) meaning there was an issue
          System.out.println("" + fails + " tests failed");
          System.exit(1);
      }
      // exuts using (0) meaning there are no issues
      System.exit(0);
   }
}
