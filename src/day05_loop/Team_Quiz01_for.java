package day05_loop;

public class Team_Quiz01_for {
	public static void main(String[] args) {
		//  for문을 이용해 A부터 Z까지 차례대로 출력하시오. (알파벳은 총 26개)
		char ch=65;		//아스키코드 A=65
		for(int i=1; i<=26; i++) {
			System.out.print(ch);
			ch++;
			if(i%9==0) {
				System.out.println();
			}
		}
	}
}
