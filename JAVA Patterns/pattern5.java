package java_patterns;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		int sp=no/2;
		int st=1;
		
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("*\t");
			}
			for(int j=1;j<=sp;j++)
			{
				System.out.print("\t");
			}
			
			if(i<=(no/2))
			{
				sp--;
				st+=2;
			}
			else
			{
				sp++;
				st-=2;
			}
			System.out.println();
		}

	}

}
