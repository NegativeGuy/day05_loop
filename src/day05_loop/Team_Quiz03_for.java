package day05_loop;

import java.util.Scanner;

public class Team_Quiz03_for {
	public static void main(String[] args) {
		// 수를 입력받고 입력받은수가 9면 종료되는 프로그램을 만드시오.
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("수 입력 : ");
			int num = sc.nextInt();
			if(num==9) {
				System.out.println("9가 입력되어 프로그램을 종료 합니다");
				break;
			}
		}
	}
}
