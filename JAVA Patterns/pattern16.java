package java_patterns;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		int sp= (2*no)-3;
		for(int i=1; i<=no;i++)
		{
			for(int a=1;a<=i;a++)
			{
				System.out.print(a+"\t");
			}
			for(int a=1;a<=sp;a++)
			{
				System.out.print("\t");
			}
			if(i<no)
			{
			for(int b=i;b>=1;b--)
			{
			
				System.out.print(b+"\t");
			}
			}
			else
			{
				for(int b=i-1;b>=1;b--)
				{
					System.out.print(b+"\t");
				}
			}
			sp-=2;
			System.out.println();
		}

	}

}
