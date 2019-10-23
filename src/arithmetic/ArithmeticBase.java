/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author RIDHIMANANDA
 * date 10/22
 */
public class ArithmeticBase 
{
 public double x,y;
 
    double calculate(double x, double y) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
      
       
       for (String operation: String.values())
        {
            System.out.println(operation.ordinal() + " " + operation);
        }
     return 0;
        
}
}        
        enum String
        {
           PLUS,
           MINUS,
           TIMES,
           DIVIDE
        }
    
   

