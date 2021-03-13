import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ScientificCalculator
{
    public ScientificCalculator() {
    }

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String args[])
    {
        int flag=0, ch;
        double num, b;
        int factnum;
        ScientificCalculator calculator = new ScientificCalculator();
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Log");
            System.out.println("4) Power");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("Square Root");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println(calculator.squareRoot(num));
                        break;
                    case 2:
                        System.out.println("Factorial");
                        System.out.print("Enter number: ");
                        factnum = reader.nextInt();
                        System.out.println(calculator.factorial(factnum));
                        break;
                    case 3:
                        System.out.println("Natural Log");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println(calculator.naturalLog(num));
                        break;
                    case 4:
                        System.out.println("Power");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        b = reader.nextDouble();
                        System.out.println(calculator.power(num,b));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        logger.info("Executing square root function");
        return result;
    }

    public int factorial(int number) {
        int result = number;
        for( int i = number-1; i >= 1; i--){
            result = result*i;
        }
        logger.info("Executing factorial function");
        return result;
    }

    public double naturalLog(double number) {
        double result = Math.log(number);
        logger.info("Executing natural log function");
        return result;
    }

    public double power(double number, double b) {
        double result = Math.pow(number, b);
        logger.info("Executing power function");
        return result;
    }
}