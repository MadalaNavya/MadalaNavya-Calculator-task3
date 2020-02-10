package com.epam.Calculator;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello calculator!" );
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        while(true) {
        	System.out.println("Enter First number:\n");
	        int a = s.nextInt();
	        System.out.println("Enter Second number:\n");
	        int b = s.nextInt();
	    System.out.println("Enter operation choice:\n1.Add\n2.Substract\n3.Multiply\n4.Divide\n5.Modulus\n");
	    int choice = s.nextInt();
	    choice=choice-1;
        if(choice<0 || choice>5) throw new Exception("Enter a valid Calculatorion.");
        	int[] x = new int[5];
			@SuppressWarnings("unused")
			int[] operations = {
					x[0] = Calculator.add(a,b),
        			x[1] = Calculator.sub(a,b),
        			x[2] = Calculator.mul(a,b),
        			x[3] = Calculator.div(a,b),
        			x[4] = Calculator.modulus(a,b),
        	};
			System.out.println(x[choice]);
			System.out.println("Exit (0):");
			int ch = s.nextInt();
			if(ch==0) {
				break;
			}
        }
        
        
    }
}
