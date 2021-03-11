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
        int flag=0,ch;
        int num1;
        int num2;
        ScientificCalculator calculator = new ScientificCalculator();
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Addition");
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
                        System.out.println("Addition");
                        System.out.println("Enter two numbers");
                        System.out.print("Enter number 1: ");
                        num1 = reader.nextInt();
                        System.out.print("Enter number 2: ");
                        num2 = reader.nextInt();
                        System.out.println(calculator.add(num1, num2));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
    public int add(int number1, int number2) {
        int result = number1 + number2;
        logger.info("Executing addition");
        return result;
    }
}