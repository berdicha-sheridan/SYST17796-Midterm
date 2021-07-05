/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 07/05/21
 */
public class ArithmeticBase 
{
    public double x, y;
    
    public enum Operation
    {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE
    };
    
    double calculate(double x, double y) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println
        (
            "Enter arithmetic operation to Perform:\n" +
            "1: PLUS\n" +
            "2: MINUS\n" + 
            "3: TIMES\n" +
            "4: DIVIDE"
        );
        
        int operationPosition = sc.nextInt() - 1;
        if  (operationPosition < 1 && operationPosition > 4)
        {
            throw new AssertionError("Please enter a correct operation");
        }
        
        switch (Operation.values()[operationPosition])
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
