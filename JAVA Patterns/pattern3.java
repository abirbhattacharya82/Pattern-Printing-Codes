package java_patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		
		int sp=no-1;
		int st=1;
		for(int i=1;i<=no;i++)
		{
			for(int a=1;a<=sp;a++)
			{
				System.out.print("\t");
			}
			for(int a=1;a<=st;a++)
			{
				System.out.print("*\t");
			}
			sp--;
			st++;
			System.out.println();
		}

	}

}
