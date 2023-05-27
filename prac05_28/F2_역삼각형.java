package prac05_28;

import java.util.Scanner;

public class F2_역삼각형 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int a = sc.nextInt();
		
		for (int i = 0; i < a ; i++) {
			for (int j = a; j > i ; j--) {
				System.out.print("*");
				
			}
		System.out.println();
		}
		
		
		
		
	}

}
