package java_patterns;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		
		int os=no/2;
		int is=-1;
		
		
		for(int i=1;i<=no;i++)
		{
			for(int a=1;a<=os;a++)
			{
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int a=1;a<=is;a++)
			{
				System.out.print("\t");
			}
			if(i>1&&i<no)
			{
				System.out.print("*\t");
			}
			for(int a=1;a<=os;a++)
			{
				System.out.print("\t");
			}
			
			if(i<=(no/2))
			{
				os--;
				is+=2;
			}
			else
			{
				os++;
				is-=2;
			}
			
			System.out.println();
		}

	}

}
