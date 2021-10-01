package java_patterns;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		int ctr=1;
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ctr+"\t");
				ctr++;
			}
			System.out.println();
		}

	}

}
