import java.util.Scanner;
class Password  
{
	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc=new Scanner (System.in);
		int pin1=1234;
		int duration=2000;
		outerloop:
			for (; ; )
			{
			   int attempt=3;
			   do
			   {
				   System.out.println();
				   System.out.println("Enter Your Pin :");
				   int pin2=sc.nextInt();
				   System.out.println();
				   
				 if (pin1==pin2)
				 {
					 System.out.println("Phone Unloacked");
					 break outerloop;
				 }
				 System.out.println("Wrong pin Entered");
				 System.out.println("You have " + (attempt-1)+"Attempt Left");
				 attempt-- ;
				   
			   }
			   while (attempt>0);
			   System.out.println("Your phone has been Locked for " +(duration)/1000  + "   Sec");
			   Thread.sleep(duration);
			   duration*=2;
			}
		
		
	}
}
