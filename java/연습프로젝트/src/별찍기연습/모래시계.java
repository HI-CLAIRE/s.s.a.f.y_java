package 별찍기연습;

import java.util.Scanner;

public class 모래시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		int num = 1;
//		for(int i=0; i<n; i++)
//		{
//			if(i <= n/2)
//			{
//				for(int j=0; j<i; j++)
//					System.out.printf("%3s", "");
//				for(int j=0; j<n-2*i; j++)
//					System.out.printf("%3d", num++);
//				System.out.println();
//			}
//			else
//			{
//				for(int j=n-i-1; j>0; j--)
//					System.out.printf("%3s", "");
//				for(int j=0; j<2*i-n+2; j++)
//					System.out.printf("%3d", num++);
//				System.out.println();
//			}
//		}
		int star = n;
		int blank = 0;
		for(int i=0; i<n; i++)
		{
			if(i < n/2)
			{
				for(int j=0; j<blank; j++)
					System.out.print(" ");
				blank++;
				for(int j=0; j<star; j++)
					System.out.print("*");
				star -=2;
				System.out.println();
			}
			else
			{
				for(int j=0; j<blank; j++)
					System.out.print(" ");
				blank--;
				for(int j=0; j<star; j++)
					System.out.print("*");
				star+=2;
				System.out.println();
			}
		}
	}
}
