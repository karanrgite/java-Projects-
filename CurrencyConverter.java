import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Know Your Currency");
		System.out.println();
		System.out.print("Enter Your amount(INR):");
		float amount= sc.nextFloat();
		System.out.println("Enter your Currency: 1) USD 2) EUR 3) GBP 4) KWD 5) JPY  6)RUB   7)CNY    8)SGD   9)ZAR   10)AUD ");
		String curr = sc.next().toLowerCase();
		
		if (curr.equals ("usd"))
		{
			float usd= amount/83.96f;
			System.out.println(amount+"INR =" +usd+ "USD");
		}
		else if (curr.equals ("eur"))
		{
			float eur= amount/92.78f;
			System.out.println(amount+"INR =" +eur+ "EUR");
		}
		else if (curr.equals("gbp"))
		{
			float gbp= amount/110.117f;
			System.out.println(amount+"INR =" +gbp+ "GBP");
		}
		else if (curr.equals("kwd"))
		{
			float kwd= amount/274.70f;
			System.out.println(amount+"INR =" +kwd+ "KWD");
		}
		else if (curr.equals("jpy"))
		{
			float jpy= amount/0.57f;
			System.out.println(amount+"INR =" +jpy+ "JPY");
		}
		else if (curr.equals("rub"))
		{
			float rub= amount/0.94f;
			System.out.println(amount+"INR =" +rub+ "RUB");
		}
		else if (curr.equals("cny"))
		{
			float cny= amount/11.79f;
			System.out.println(amount+"INR =" +cny+ "CNY");
		}
		else if (curr.equals("sgd"))
		{
			float sgd= amount/64.27f;
			System.out.println(amount+"INR =" +sgd+ "SGD");
		}
		else if (curr.equals("zar"))
		{
			float zar= amount/4.69f;
			System.out.println(amount+"INR =" +zar+ "ZAR");
		}
		else if (curr.equals("aud"))
		{
			float aud= amount/56.50f;
			System.out.println(amount+"INR =" +aud+ "AUD");
		}
		else{
		System.out.println("Wrong Currency Entered");
		}
	}
}
