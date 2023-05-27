package prac05_28;

import java.util.Scanner;

public class F3_오른쪽정렬삼각형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		

			int a = 4;
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					String star = (j < a) ? " " : "*" ; 
					System.out.print(star);
				}
				a--;
				System.out.println();
			}
				
			}
}
		
		
		
		
	


