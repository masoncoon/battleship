import java.util.Scanner;

public class BattleshipRunner
	{
		static Scanner userInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				//intro();
				System.out.println();
				Board.display();
			}

		public static void intro()
			{
				System.out.println("Hello player, and welcome to battleship!");
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello " + name + ", press enter to play!");
				String play = userInput.nextLine();
			}
	}
