package BOJ;

import java.util.Scanner;

public class 스위치켜고끄기_1244 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int[] arr = new int[N];

			for(int i = 0; i < N; i++)
				arr[i] = sc.nextInt();

			int stdts = sc.nextInt();
			for(int i = 0; i < stdts; i++) {
				
				int gender = sc.nextInt();
				int num = sc.nextInt();

				if(gender == 1)
					for(int j = num; j < N; j += num)
						arr[j - 1] = (arr[j - 1] + 1) % 2;

				if(gender == 2) {
					arr[num - 1] = (arr[num - 1] + 1) % 2;
					for(int k = 1; (0 <= (num - 1 - k)) && ((num - 1 + k) < N); k++) {
						if(arr[num - 1 - k] != arr[num - 1 + k])
						break;
						arr[num - 1 - k] = (arr[num - 1 - k] + 1) % 2;
						arr[num - 1 + k] = (arr[num - 1 + k] + 1) % 2;
					}
				}
			}
			
			for(int i = 0; i < N; i++) {
				if(i%20 == 0)
					System.out.println(arr[i]);
				else if((i + 1) % 20 == 0)
					System.out.println();
				else
					System.out.print(arr[i] + " ");
			}


			sc.close();
	
	}

}
