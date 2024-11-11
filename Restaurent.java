import java.util.*;
class Restaurent 
{
	static String username;
	static String pass;
	static String phone;
	static ArrayList<String> cart= new ArrayList<>();
	static double bill;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("         ***** Welcome To Taj ***** ");
			System.out.println();
			System.out.println("1. Sign In");
			System.out.println("2. Sign up");
			System.out.println();
			System.out.println("Enster Your Option");
			int option=sc.nextInt();
			switch(option)
			{
				case 1: createAccount(sc);break;
				case 2: login(sc);break;
				default: System.out.println("Wrong option Enterered");
			}
		}	
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println();
		System.out.println(" Create Account");
		System.out.println();
		System.out.print("Username : ");
		sc.nextLine();
		username=sc.nextLine();
		System.out.print("Contact Number :");
		phone=sc.next();
		System.out.print("Password : ");
		pass=sc.next();
		System.out.println();
		System.out.println("Account Created ");
		System.out.println();
	}
	public static void login(Scanner sc)
	{
		if (username!=null)
		{
			for (int i=1;i<=3;i++)
			{
				System.out.println(" ");
				System.out.println("Login Page ");
				System.out.println();
				System.out.print("Username/Contact :");
				sc.nextLine();
				String un1=sc.nextLine();
				System.out.print("Password :");
				String pass1=sc.next();
				
				if (((un1.equals(username))||(un1.equals(phone)))&&(pass1.equals(pass)))
				{
					homepage(sc);
				}
				else{
					System.out.println();
					System.out.println("Wrong creadential Entered");
					System.out.println();
				}
			}
			System.exit(0);
		}
		else {
			System.out.println("Create Your Account First ");
		}
	}
	public static void homepage(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println("Home Page");
			System.out.println();
			System.out.println(" 1. Veg Menu");
			System.out.println(" 2. Non-Veg Menu");
			System.out.println(" 3. Checkout");
			System.out.println("4. Logout");
			System.out.println();
			System.out.print("Enter An OPtion :");
			int option=sc.nextInt();
			switch(option)
			{ 
				case 1:vegmenu(sc);break;
				case 2:nonvegmenu(sc);break;
				case 3: checkout(sc);break;
				case 4:System.exit(0); 
					System.out.println("Thank You Never Visit Again");break;
				default : System.out.println("Wrong Option") ;break;
				
			}
		}
	}
	public static void vegmenu(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println("Veg Dishes");
			System.out.println("101.Paneer Tikka :200");
			System.out.println("102.Kaju Curry : 300");
			System.out.println("103.Veg Paratha : 150");
			System.out.println("104.Dal Tadka : 190");
			System.out.println("105.Veg Biryani :300");
			System.out.println("106.Menu");
			System.out.println();
			System.out.print("Enter The Dish ID : ");
			int id = sc.nextInt();
			switch(id)
			{
				case 101: cart.add("PaneerTikka : 200");
				 bill+=200;
				          System.out.println("Paneer Tikka Added Inside The cart");break;
				case 102: cart.add("KajuCurry : 300");
				 bill+=300;
				          System.out.println("Kaju Curry Added Inside The cart");break;
				case 103: cart.add("Veg Paratha : 150");
				 bill+=150;
				          System.out.println("Veg Paratha Added Inside The cart");break;	
			    case 104: cart.add("Dal Tadka : 190");
				 bill+=190;
				          System.out.println("Dal Tadka Added Inside The cart");break;
			    case 105: cart.add("Veg Biryani : 300");
				 bill+=300;
				          System.out.println("Veg Biryani Added Inside The cart");break;
				case 106: return;
				     default :   System.out.println("Wrong Dish Id : ");
			}
			
		}
	}
	public static void nonvegmenu(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println("Non-Veg Dishes");
			System.out.println("107.Chicken Tikka:200");
			System.out.println("108.Chicken Curry : 300");
			System.out.println("109.Chicken Bhakri: 350");
			System.out.println("110. Chicken Fry : 190");
			System.out.println("111.Chicken Biryani :300");
			System.out.println("106.Menu");
			System.out.println();
			System.out.print("Enter The Dish ID :");
			int id = sc.nextInt();
			switch(id)
			{
				case 107: cart.add("Chicken Tikka : 200");
				 bill+=200;
				          System.out.println("Chicken Tikka Added Inside The cart");break;
				case 108: cart.add("Chicken Curry : 300");
				 bill+=300;
				          System.out.println("Chicken Curry Added Inside The cart");break;
				case 109: cart.add("Chicken Bhakri : 350");
				 bill+=350;
				          System.out.println("Chicken Bhakri Added Inside The cart");break;	
			    case 110: cart.add("Chicken Fry : 190");
				 bill+=190;
				          System.out.println("Chicken Fry Added Inside The cart");break;
			    case 111: cart.add("Chicken Biryani : 300");
				 bill+=300;
				          System.out.println("Chicken Biryani Added Inside The cart");break;
				case 106: return;
				     default :   System.out.println("Wrong Dish Id");
			}
			
		}
		
	}
	public static void cart(Scanner sc)
	{
		System.out.println("your Purchased Food");
		System.out.println();
		for (String food:cart )
		{
			System.out.println(food);
		}
		System.out.println();
		System.out.println("Your Total Bill is : " +bill+"rs");
		System.out.println();
	}
	public static void checkout(Scanner sc)
	{
		System.out.println("Cheakout Now");
		cart(sc);
	}
}
