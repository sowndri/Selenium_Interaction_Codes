package SeleniumStuffs;

import java.util.Scanner;

public class test {

	public static void main(String[] args)
	{
		
Scanner obj = new Scanner(System.in);
System.out.println("Enter the values A:");
Integer A = (int) obj.nextByte();
System.out.println("Enter the values B:");
Integer B = (int) obj.nextByte();
int C = A+B;
System.out.println("Sum of the values:" +C);
	}

}
