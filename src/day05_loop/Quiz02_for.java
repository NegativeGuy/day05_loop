package day05_loop;

public class Quiz02_for {
	public static void main(String[] args) {
		// Quiz_01. 구구단 만들기
		System.out.println("Quiz_01");
		int result;
		for(int su=1; su<=9; su++) {
			for(int dan=2; dan<=9; dan++) {
				result = dan*su;
				System.out.print(dan+"x"+su+"="+result+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		// Quiz_02. 2중 for문으로 아래와 같이 출력하기
		/*
			1	2	3	4	5
			2	4	6	8	10
			3	6	9	12	15
			4	8	12	16	20
			5	10	15	20	25
		*/
		System.out.println("Quiz_02");
		for(int hor=1; hor<=5; hor++) {
			for(int vir=1; vir<=5; vir++) {
				System.out.print(hor*vir+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		// Quiz_03. 2중 for문으로 아래와 같이 출력하기
		/*
			1	2	3	4	5
			6	7	8	9	10
			11	12	13	14	15
			16	17	18	19	20
			21	22	23	24	25
		 */
		System.out.println("Quiz_03");
		int sum=1;
		for(int hor=1; hor<=5; hor++) {
			for(int vir=1; vir<=5; vir++) {
				System.out.print(sum+"\t");
				sum += 1;
			}
			System.out.println();
		}
		
	}
}
