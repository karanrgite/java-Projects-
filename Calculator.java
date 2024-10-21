import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1 :");
		double num1 = sc.nextDouble();
		System.out.println("Enter num2:");
		double num2 = sc.nextDouble();
		System.out.println("Enter Operator:");
		char operator = sc.next().charAt(0);
		double output=0;
		boolean flag=true;
		if (operator=='+')
		{
			output=num1+num2;
		}
		else if (operator== '-')
		{
			output=num1-num2;
		}
		else if (operator== '*')
		{
			output=num1*num2;
		}
		else if (operator=='/')
		{
			output=num1/num2;
		}
		else if (operator=='%')
		{
			output=num1%num2 ;
		}else {
			flag=false;
			System.out.println("Wrong output");
		}
		if(flag){
			System.out.println("Output :" +num1 + "" +operator+ "" +num2+ "=" +output);
		}
		
		
	}
}
