package 별찍기연습;

import java.util.Scanner;

public class 나비넥타이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int blankEnd = n-2;
		int blankStart = 1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(blankStart <= j && j <=blankEnd)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			if(i< n/2)
			{
				blankStart++;
				blankEnd--;
			}
			else
			{
				blankStart--;
				blankEnd++;
			}
			System.out.println();
		}
	}

}
