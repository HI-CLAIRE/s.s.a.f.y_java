package D2;

import java.util.Scanner;

public class 쉬운거스름돈_1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			//int cnt = 0;
			//int ans = 0;
			int[] arr = new int[7];
			int N = sc.nextInt();
			while(N > 0)
			{
				for(int i=0; i<8; i++)
				{
					arr[i] = N / 50000;
				}
			}
			System.out.println(arr);
		}
	}

}
