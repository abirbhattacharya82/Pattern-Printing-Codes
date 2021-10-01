package java_patterns;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		int st=no;
		int sp=0;
		
		for(int i=1;i<=no;i++)
		{
			for(int a=1;a<=sp;a++)
			{
				System.out.print("\t");
			}
			for(int a =1;a<=st;a++)
			{
				System.out.print("*\t");
			}
			sp++;
			st--;
			System.out.println();
		}

	}

}
