package day05_loop;

public class Quiz01_for {
	public static void main(String[] args) {
		// Quiz_01
		// 다음과 같이 출력 하시오
		/*
		 		1. hello
		 		2. hello
		 		3. hello
		 		4. hello
		*/
		System.out.println("====Quiz_01====");
		for(int i=1; i<5; i++) {
			System.out.println(i+". hello");
		}
		
		// Quiz_02
		// 1~100까지의 합 중에서 그 합이 528일때 i의 값을 출력 하시오
		System.out.println("====Quiz_02====");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum == 528) {
				System.out.println(i);
			}
		}
		
		// Quiz_03
		// for문을 이용하여 아래와 같이 출력 하시오
		/*
				1	2	3	4	5
				6	7	8	9	10
				11	12	13	14	15
				16	17	18	19	20
				21	22	23	24	25
		*/
		System.out.println("====Quiz_03====");
		for(int i=1; i<=25; i++) {
				System.out.print(i+"\t");
				if(i%5==0) {
					System.out.println();
			}
		}
	}
}
