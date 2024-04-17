package ProblemStatement_1;
import java.util.Scanner;

public class ExConFair 
{
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        
	        
	        int minCount = Math.max(a, b);
	        int maxCount = a + b;
	        
	      
	        System.out.println(minCount + " " + maxCount);
	        
	        scanner.close();
	    }
	}

	


