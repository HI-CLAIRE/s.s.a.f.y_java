package 일주차;

import java.util.Scanner;

public class 소수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 0;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 2) continue;
			cnt += isPrime(arr[i]);
		}
		System.out.println(cnt);
	}

	private static int isPrime(int num) {
		if(num == 2) return num;
		for(int i=2; i<num; i++) {
			if(num % i == 0) return 0;
		}
		return num;
	}
	
	

}
