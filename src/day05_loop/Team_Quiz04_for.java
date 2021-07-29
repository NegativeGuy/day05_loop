package day05_loop;

public class Team_Quiz04_for {
	public static void main(String[] args) {
		//2중 for문을 이용하여 ★를 한줄에 7개, 총 7줄 출력하시오
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
