package day05_loop;

public class Team_Quiz01_for {
	public static void main(String[] args) {
		//  for���� �̿��� A���� Z���� ���ʴ�� ����Ͻÿ�. (���ĺ��� �� 26��)
		char ch=65;		//�ƽ�Ű�ڵ� A=65
		for(int i=1; i<=26; i++) {
			System.out.print(ch);
			ch++;
			if(i%9==0) {
				System.out.println();
			}
		}
	}
}
