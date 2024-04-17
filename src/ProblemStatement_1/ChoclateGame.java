package ProblemStatement_1;
import	java.util.Scanner;
public class ChoclateGame
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // If either dimension is odd, the first player wins, else the second player wins.
        if (n % 2 == 1 || m % 2 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
	
	}
}
