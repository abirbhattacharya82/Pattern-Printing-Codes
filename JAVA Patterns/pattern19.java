package java_patterns;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		
		int gap=(no/2)-1;
		
		
		for(int i=1;i<=no;i++)
		{
			
			if(i==1)
			{
				for(int a=1;a<=(no/2)+1;a++)
				{
					System.out.print("*\t");
				}
				for(int a=1;a<=(no/2)-1;a++)
				{
					System.out.print("\t");
				}
				System.out.print("*\t");
			}
			
			else if(i<=(no/2))
			{
				for(int a=1; a<=(no/2);a++)
				{
					System.out.print("\t");
				}
				System.out.print("*\t");
				for(int a=1;a<=(no/2)-1;a++)
				{
					System.out.print("\t");
				}
				System.out.print("*\t");
			}
			else if(i==(no/2)+1)
			{
				for(int a=1;a<=no;a++)
				{
					System.out.print("*\t");
				}
			}
			else if(i<no)
			{
				System.out.print("\t");
				for(int a=1;a<=(no/2)-1;a++)
				{
					System.out.print("\t");
				}
				System.out.print("*\t");
				for(int a=1;a<=(no/2)+1;a++)
				{
					System.out.print("\t");
				}
			}
			else
			{
				System.out.print("*\t");
				for(int a=1;a<=(no/2)-1;a++)
				{
					System.out.print("\t");
				}
				for(int a=1;a<=(no/2)+1;a++)
				{
					System.out.print("*\t");
				}
				
			}
			
			System.out.println();
			
		}

	}

}
