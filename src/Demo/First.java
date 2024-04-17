package Demo;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
			Scanner	s=new	Scanner(System.in);
			
			String	name;
			char	initial;
			int	Mark1,Mark2;
			float	cgpa;
			
			System.out.println("Enter	the	details:");
			name=s.nextLine();
			initial=s.next().charAt(0);
			Mark1=s.nextInt();
			Mark2=s.nextInt();
			cgpa=s.nextFloat();
			
			System.out.println("Initial:	"+initial);
			System.out.println("Name:	"+name+"\n"+"Mark1:"+Mark1+"\n");
			System.out.println("Mark2	:"+Mark2+"\n"+"cgpa:"+cgpa);
	}

}
