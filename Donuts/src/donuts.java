import java.util.Scanner;

public class donuts
	{

		public static void main(String[] args)
			{
				//printDonuts();
				//ascendAndDesent();
				//multiplesOfFive();
				//totalOfFive();
				upperboundLowerboend();
			}

		private static void printDonuts()
			{
				for (int i = 1; i <= 5; i++)
					{
						System.out.println("I love donuts!");
					}
			}

		private static void ascendAndDesent()
			{
				for (int i = 1; i <= 5; i++)
					{
						System.out.println(i);
					}
				for (int i = 5; i >= 1; i--)
					{
						System.out.println(i);
					}
			}
		private static void multiplesOfFive()
			{
				for (int i = 5; i <= 100; i += 5)		
					{
						System.out.println(i);
					}
			}
		
		private static void totalOfFive()
			{
				int sum = 0;
				for (int i = 5; i <= 100; i += 5)
					{
						sum += i;
						System.out.println(i);
					}
				System.out.println("Your total is: " + sum);

			}
		private static void upperboundLowerboend()
			{
				System.out.println("Give me a lowerbound.");
				Scanner userInput = new Scanner (System.in);
				int lowerbound = userInput.nextInt();

				
				System.out.println("Give me a upperbound.");
				Scanner userInput1 = new Scanner (System.in);
				int upperbound = userInput1.nextInt();
				
				int sum = 0;
				for (int )
			}
		

	}
