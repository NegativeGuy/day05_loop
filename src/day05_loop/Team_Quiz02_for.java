package day05_loop;

public class Team_Quiz02_for {
	public static void main(String[] args) {
//�� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		for(int dc1=1; dc1<=6; dc1++) {
			for(int dc2=1; dc2<=6; dc2++) {
				if(dc1+dc2==6) {
					System.out.println(dc1+" + "+dc2+" = 6");
				}
			}
		}
	}
}
