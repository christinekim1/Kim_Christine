import java.util.Random;
public class EX_01
{
	public static void main (String[]args)
	{
		Random dice = new Random();
		
		int player = dice.nextInt(6)+1;
		System.out.println("You rolled a " + player);
		
		int computer = dice.nextInt(6)+1;
		System.out.println("Computer rolled a " + computer);
		
		rolldice(player, computer);
	}
	public static void rolldice(int player, int computer)
	{
		if(player > computer)
			System.out.println("You win!");
		if(computer > player)
			System.out.println("You lose D:");
	}
}