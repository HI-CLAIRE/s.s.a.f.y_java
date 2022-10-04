package 일주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 경로의개수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[T];
		for(int t=0; t<T; t++) {
			arr[t] = Integer.parseInt(st.nextToken());
		}
		
		
		int ans = 1;
		if(T == 2) {
			System.out.println(arr[0]);
		} else {
			for(int i : arr) {
				ans *= i;
			}
			System.out.println(ans);
		}
	} 

}
