package java_patterns;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		int bsp=no/2;
		int asp=no/2;
		int st=1;
		
		for(int i=1;i<=no;i++)
		{
			for(int a=1;a<=bsp;a++)
			{
				if(i!=(no/2)+1)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print("*\t");
				}	
			}
			
			for(int a=1;a<=st;a++)
			{
				System.out.print("*\t");
			}
			for(int a=1;a<=asp;a++)
			{
				System.out.print("\t");
			}
			
			if(i<=(no/2))
			{
				st++;
				asp--;
			}
			else
			{
				st--;
				asp--;
			}
			
			System.out.println();
		}

	}

}
