import java.util.*;
class BankApplication
{
	static String username;
	static long mobile;
	static String pan;
	static long adhar;
	static String address;
	static int pin;
	static double bal;
	final static long accountnumber = 1234123412334L;
	final static String IFScode = "ABC1234";
	static ArrayList<String> statement = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		welcome();
	
	}
	public static void welcome()
	{
		for (; ; )
		{
			Scanner sc=new Scanner (System.in);
			System.out.println();
			System.out.println("        *** Welcome *** ");
			System.out.println("         LAKSHMI CHIT FUND   ");
			System.out.println();
			System.out.println("1. Existing User");
			System.out.println("2. Create Bank Account");
			System.out.println();
			System.out.println("Enter an Option :");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1: login(sc);break;
				case 2: createAccount(sc);break;
				default: System.out.println("Wrong Option Entered");
			}
		}
	}
	public static void login(Scanner sc)
	{
		if (username!=null)
		{
			for (; ; )
			{
				System.out.println();
				System.out.println("      *** Login Module ***  ");
				System.out.println();
				System.out.println("Mobile :");
				long mobile1 = sc.nextLong();
				System.out.println("Pin :");
				int pin1 = sc.nextInt();
				if ((mobile==mobile1)&&(pin==pin1))
				{
					homepage(sc);
				}
				else 
				{
					System.out.println();
					System.out.println("Wrong Credential Entered");
					System.out.println();
				}
				System.exit(0);
			}
			
		}
		else 
		{
			System.out.println();
			System.out.println("Create Your Account First");
			System.out.println();
			
		}
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println();
		System.out.println("  *** Account Creation Module ***");
		System.out.println();
		System.out.println("Username :");
		sc.nextLine();
		username = sc.nextLine();
		System.out.print("Mobile :");
		mobile = sc.nextLong();
		System.out.print("Adhar :");
		adhar = sc.nextLong();
		System.out.print("Pancard :");
		pan = sc.next();
		System.out.print("Address : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.print("pin :");
		pin = sc.nextInt();
		System.out.print("Enter The Ammount To Deposite : ");
		bal = sc.nextDouble();
		statement.add("Deposite :"+bal);
		
		System.out.println();
		System.out.println("Account Created Successfully ");
		System.out.println();
	}
	public static void homepage(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println("     **** Home Page Module **** ");
			System.out.println();
			System.out.println("1.Deposite Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3.Cheak Balance");
			System.out.println("4. Statement");
			System.out.println("5.Edit Profile");
			System.out.println("6. Logout");
			System.out.println();
			System.out.println("Enter An Option : ");
			int option= sc.nextInt();
			System.out.println();
			switch(option)
			{
				case 1: deposite(sc);break;
				case 2: withdraw(sc);break;
				case 3: cheakbalance(sc);break;
				case 4: statement();break;
				case 5: editprofile(sc);break;
				case 6: System.exit(0);
				default : System.out.println("Wrong Option Entered");
			}
		}
	}
	public static void deposite(Scanner sc)
	{
		System.out.println("      **** Deposite Amount **** ");
		System.out.println();
		System.out.println("Enter The Amount : ");
		double depositeAmount = sc.nextDouble();
		bal +=depositeAmount;
		statement.add("deposite : "+depositeAmount);
		System.out.println();
		System.out.println("Amount Deposited Successfully");
	}
	public static void withdraw(Scanner sc)
	{
		for (int i=1;i<=3 ;i++ )
		{
			System.out.println(" **** Withdraw Amount **** ");
			System.out.println();
			System.out.println("Enter The amount : ");
			double withdrawAmount = sc.nextDouble();
			System.out.println("Enter Your Pin :");
			int pin1 = sc.nextInt();
			if (pin==pin1)
			{
				if (withdrawAmount<=bal)
				{
					bal-=withdrawAmount;
					statement.add("Withdraw : "+withdrawAmount);
					System.out.println("AMount debited Successfully");
				}
				else 
				{
					System.out.println("Insufficient Balance");
				}
				return;
			}
			else 
			{
				System.out.println();
				System.out.println("Wrong Option Entered");
			}
		}
		System.out.println();
		System.out.println("Your Account Has been deactivated for 24 hours");
		System.exit(0);
	}
	public static void cheakbalance(Scanner sc)
	{
		for (int i=1;i<=3 ;i++ )
		{
			System.out.println(" **** Cheak Balance **** ");
			System.out.println("Enter Your Pin : ");
			int pin1 = sc.nextInt();
			if (pin1==pin)
			{
				System.out.println();
				System.out.println("Account Balance is : "+bal+"rs");
				return;
			}
			else 
			{
				System.out.println();
				System.out.println("Wrong Pin Entered");
			}
		}
		System.out.println();
		System.out.println("Your Account has been deactivated for 24 hours");
		System.exit(0);
	}
	public static void statement()
	{
		System.out.println("   **** Statement **** ");
		System.out.println();
		for (String tran: statement)
		{
			System.out.println(tran);
		}
		
	}
	public static void editprofile(Scanner sc)
	{
		System.out.println("  ****  Edit Profile ****");
		System.out.println();
		System.out.println(" What do You Want to Edit : ");
		System.out.println("1.Name:");
		System.out.println("2.mobile number:");
		System.out.println("3.Address");
		System.out.println("4.pin");
		System.out.println();
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		System.out.println();
		switch (num)
		{
		case 1: name(sc);break;
		case 2: mobilenum(sc);break;
		case 3: address(sc);break;
		case 4: pin(sc);break;
		default : System.out.println("Enter Wrong Option");
		}
	}
	public static void name(Scanner sc)
	{
		System.out.println("Enter The Old name : ");
		String name1 = sc.nextLine();
		if (username==name1)
		{
			System.out.println("Enter The New Username : ");
		    String newusername = sc.nextLine();
			username = newusername;
			System.out.print("Your user name Successfully changed to :"+newusername);
		}
		else 
		{
			System.out.println("Username Not Match");
		}
		
	}
	public static void mobilenum(Scanner sc)
	{
		System.out.println("Enter The Old mobile number : ");
		long mobnum = sc.nextLong();
		if (mobile==mobnum)
		{
			System.out.println("Enter The New Mobile Number : ");
		    long newmobnumber = sc.nextLong();
			mobile = newmobnumber;
			System.out.print("Your mobile Number Successfully changed to :"+newmobnumber);
		}
		else 
		{
			System.out.println("Mobile Number Not Match");
		}
	}
	public static void address(Scanner sc)
	{
		
		{   System.out.println("Your Old Address is :"+ address);
			System.out.println("Enter The New Address : ");
			sc.nextLine();
		    String newaddress = sc.nextLine();
			address = newaddress;
			System.out.print("Your Address Successfully changed to :"+newaddress);
		}
		
	}
	public static void pin(Scanner sc)
	{
		for (int i=1;i<=3 ;i++ )
		{
		System.out.println("Enter The Old pin : ");
		int pin2 = sc.nextInt();
		  if (pin==pin2)
		{
			System.out.println("Enter The New pin : ");
		    int newpin = sc.nextInt();
			pin = newpin;
			System.out.print("Your pin Successfully changed to :"+newpin);
		}
		else 
		{
			System.out.println("pin Not Match");
		}
		
	}
	System.exit(0);
  }
}
