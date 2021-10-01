package java_patterns;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		int sp=2;
		int st=1;
		int ctr=1;
		
		for(int i=1; i<=no;i++)
		{int ctrn=ctr;
			for(int a=1;a<=sp;a++)
			{
				System.out.print("\t");
			}
			for(int a=1;a<=st;a++)
			{
				System.out.print(ctrn+"\t");
				if(a<=(st/2))
				{
					ctrn++;
				}
				else
				{
					ctrn--;
				}
				
			}
			for(int a=1;a<=sp;a++)
			{
				System.out.print("\t");
			}
			
			if(i<=(no/2))
			{
				sp--;
				st+=2;
				ctr++;
			}
			else
			{
				sp++;
				st-=2;
				ctr--;
			}
			
			System.out.println();
		}

	}

}
