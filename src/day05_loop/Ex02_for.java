package day05_loop;

import java.util.Scanner;

public class Ex02_for {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeat;
		System.out.println("�ݺ� Ƚ�� �Է�");
		repeat = input.nextInt();
		
		for(int i=0; i<repeat; i++) {
			System.out.println(i+".�ݺ�");
		}
		
		System.out.println("===���ҽ�===");
		for(int i=10; i>0; i--) {	//i=i-1
			System.out.println(i+". ����");
		}
		
		System.out.println("---2�� ����---");
		for(int i=0; i<10; i+=2) {	//i=i+2
			System.out.println(i+". ����");
		}
	}
}