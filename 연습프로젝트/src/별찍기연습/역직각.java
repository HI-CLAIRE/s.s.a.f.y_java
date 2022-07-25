package 별찍기연습;

import java.util.Scanner;

public class 역직각 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<i; j++)
				System.out.printf("%3s", "");
			for(int j=0; j<n-i; j++)
				System.out.printf("%3d", num++);
			System.out.println();
		}
	}

}
