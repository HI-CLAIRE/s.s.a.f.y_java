package 별찍기연습;

import java.util.Scanner;

public class 이등변 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i -1; j++)
				System.out.printf("%3s", "");
			for(int j=0; j<2*i+1; j++)
				System.out.printf("%3d", num++);
			if(i != n-1)
			System.out.println();
		}
	}

}
