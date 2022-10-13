package IM대비SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class 일회용2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int k_min = sc.nextInt();
			int k_max = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int c1=0, c2=0, c3=0, T1=0, T2=0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int ans = 0;
			boolean isOk = true;
			
			for(int i=0; i<N-1; i++) {
				
				for(int j=i+1; j<N; j++) {
					T1 = j;
					T2 = T1;
					
					if(arr[j]<arr[T1]) {
						c1++;
					} else if(arr[T1]<=arr[j] && arr[j]<arr[T2]) {
						c2++;
					} else {
						c3++;
					}
					System.out.println(c1 + " " + c2 + " " + c3);
				}
				max = Math.max(c1, Math.max(c2, c3));
				min = Math.min(c1, Math.min(c2, c3));
				System.out.println(max + " " + min);
				if(max > k_max || min < k_min) {
					ans = -1;
					isOk = false;
					break;
				}
				
				if(isOk) {
					ans = Math.min(ans, max - min);
					System.out.println("1234");
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
