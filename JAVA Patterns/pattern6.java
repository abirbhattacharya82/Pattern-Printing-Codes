package java_patterns;

import java.util.Scanner;

public class patter6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		int st=(no/2)+1;
		int sp=1;
		
		for(int i=1;i<=no;i++)
		{
			for(int a=1;a<=st;a++)
			{
				System.out.print("*\t");
			}
			for(int a=1;a<=sp;a++)
			{
				System.out.print("\t");
			}
			for(int a=1;a<=st;a++)
			{
				System.out.print("*\t");
			}
			if(i<=(no/2))
			{
				st--;
				sp+=2;
			}
			else
			{
				st++;
				sp-=2;
			}
			
			System.out.println();
		}

	}

}
