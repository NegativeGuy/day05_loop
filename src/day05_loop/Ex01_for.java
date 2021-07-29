package day05_loop;

public class Ex01_for {
	public static void main(String[] args) {
		/*
		for의 문법		 ┌─<──5──┐	
				┌─1──>───2─┐     │
			for(초기값 ; 조건식; 증감식){ 
				종속문장<──3─┘    ↑
			}		└────4──────┘
		
		초기값 -> 
		조건식 -> 
		종속문장 -> 
		증감식 -> 
		조건식 -> 
		종속문장 -> 
		증감식 -> ... 순으로 작동
		*/
		
		int sum = 0, cnt = 1;
		sum += cnt++; //1;
		sum += cnt++; //2;
		sum += cnt++; //3;
		sum += cnt++; //4;
		sum += cnt++; //5;
		sum += cnt++; //6;
		sum += cnt++; //7;
		sum += cnt++; //8;
		sum += cnt++; //9;
		sum += cnt++; //10;
		System.out.println(sum);
		System.out.println(cnt);
		
		sum = 0;
		for(cnt=1; cnt <=10; cnt++) {
			sum += cnt;			// sum = sum + cnt;
		}
		System.out.println("sum : "+sum);
		
	}
}
