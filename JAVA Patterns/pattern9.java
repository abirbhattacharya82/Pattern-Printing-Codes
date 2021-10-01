package java_patterns;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				if(i==j||i+j==no+1)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}

	}

}
