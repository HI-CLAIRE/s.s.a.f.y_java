package scs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IM_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();    // 사원수  
			int kMin = sc.nextInt(); // 최소인원 
			int kMax = sc.nextInt(); // 최대인원 
								
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=1; i<=N; i++)
				list.add(sc.nextInt());
				
			Collections.sort(list);
			
			int max = list.get(list.size() - 1);
			int min = list.get(0);
			
			int ans = Integer.MAX_VALUE;
			for(int T1 = 1; T1 < 100; T1++) {
				for(int T2 = T1 + 1; T2 < 100; T2++) {
					
					int A = 0, B = 0, C = 0;
					for(int n : list) {
						
						if(n < T1)
							A++;
						else if(T1 <= n && n < T2)
							B++;
						else if(T2 <= n)
							C++;

					}
					if(A < kMin || A > kMax || B < kMin || B > kMax || C < kMin || C > kMax)
						break;

					min = Math.max(Math.max(A, B), C) - Math.min(Math.min(A, B), C);
					ans = Math.min(ans, min);
				}
			}

			if(ans == Integer.MAX_VALUE)
				ans = -1;
			
			System.out.println("#" + tc + " " + ans);
		}
		
		sc.close();
	}

}