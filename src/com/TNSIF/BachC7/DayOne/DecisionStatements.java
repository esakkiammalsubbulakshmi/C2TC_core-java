package com.TNSIF.BachC7.DayOne;

public class DecisionStatements {

	public static void main(String[] args) {
		//if	statement
				int	mark=92;
				if(mark>=50)
				{
					System.out.println("pass");
				}
				
				
				
				//if	else	statement
				int	age=11;
				if(age>=18)
					{
						System.out.println("Eligible");
						
					}
					
				else
					{
						System.out.println("Not	Eligible");
				
					}
				
				
				
				//nested	if
					float	cgpa=9.5f;
					if(cgpa>=6.5)
					{
						if(cgpa>=8.5)
						{
							System.out.println("Excellent");
						}
						else
						{
							System.out.println("average");
						}
					}
					else
						{
							System.out.println("very	low");
						}
	}

}
