package day05_loop;

public class Team_Quiz02_for {
	public static void main(String[] args) {
//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
		for(int dc1=1; dc1<=6; dc1++) {
			for(int dc2=1; dc2<=6; dc2++) {
				if(dc1+dc2==6) {
					System.out.println(dc1+" + "+dc2+" = 6");
				}
			}
		}
	}
}
