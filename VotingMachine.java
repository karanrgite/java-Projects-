import java.util.Scanner;
class VotingMachine 
{ static int Bjp,Con, Shivsena,Manase,Aap,Rastravadi, Nota;
	public static void main(String[] args) 
	{
		System.out.println( "          *** Voting Machine ***");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter The Number of Voters :");
		int voters=sc.nextInt();
		for (int i=1; i<=voters; i++ )
		{
		System.out.println(" 1) BJP 2) CON 3) SHIVSENA 4) MANASE 5) AAP 6)RASTRAVADI 7) NOTA"); 
		System.out.print("Enter an Option:");
		int option =sc.nextInt();
		
		switch(option)
		{
			case 1: Bjp++;
				System.out.println("Namo Namo");break;
				
			case 2: Con++;
				System.out.println("Gandhi ");break;
				
			case 3: Shivsena++;
				System.out.println("Dhanushaban");break;
				
			case 4: Manase++;
				System.out.println("Jai Maharastra");break;
				
			case 5: Aap++;
				System.out.println("Aap ka ak vote muje jail se aajad karega");break;
				
			case 6:Rastravadi++;
				System.out.println("Ajit Dada");break;
				
			case 7: Nota++;
				System.out.println("You are Educated");break;
				
			default: 
				System.out.println("Enter Wrong Option");i--;
		 }
			
		}
		if (Bjp>Con && Bjp>Shivsena && Bjp>Manase && Bjp>Aap && Bjp>Rastravadi && Bjp>Nota)
		{ 
			System.out.println("Bjp Win the Election By:" +Bjp +" Votes");
		}
		else if (Con>Bjp && Con>Shivsena && Con>Manase && Con>Aap && Con>Rastravadi && Con>Nota)
		{
			System.out.println("Con Win the Election BY:" +Con+" Votes");
		}
		else if (Shivsena>Bjp && Shivsena>Con && Shivsena>Manase && Shivsena>Aap && Shivsena>Rastravadi && Shivsena>Nota)
		{
			System.out.println("Shivsena Win the Election By:" +Shivsena+" Votes");
		}
		else if (Manase>Bjp && Manase>Shivsena && Manase>Con && Manase>Aap && Manase>Rastravadi && Manase>Nota)
		{
			System.out.println("Manase Win the Election BY: " +Manase+" Votes");
		}
		else if (Aap>Bjp && Aap>Shivsena && Aap>Manase && Aap>Con && Aap>Rastravadi && Aap>Nota)
		{
			System.out.println("Aap Win the Election: " +Aap+" Votes");
		}
		else if (Rastravadi>Bjp && Rastravadi>Shivsena && Rastravadi>Manase && Rastravadi>Aap && Rastravadi>Con && Rastravadi>Nota)
		{
			System.out.println("Rastravadi Win the Election:" +Rastravadi+" Votes");
		}
		else 
		{
			System.out.println("Nota: So No one is Winner :" +Nota+" Votes");
		}
	
	}
}
