package day05_loop;

import java.util.Scanner;

public class Team_Quiz03_for {
	public static void main(String[] args) {
		// ���� �Է¹ް� �Է¹������� 9�� ����Ǵ� ���α׷��� ����ÿ�.
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("�� �Է� : ");
			int num = sc.nextInt();
			if(num==9) {
				System.out.println("9�� �ԷµǾ� ���α׷��� ���� �մϴ�");
				break;
			}
		}
	}
}
