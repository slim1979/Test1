import java.util.Scanner;
public class Moderation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] m = {"����", "������", "����", "������"};
		
		Scanner sc = new Scanner(System.in);
			System.out.print("������� �����: ");
				String text = sc.nextLine();
				
		for (int i=0; i<m.length; i++) {
			text = text.replaceAll(m[i], "***");
		}
		System.out.println("��� ����� ����� ��������� : " +text);
		
		
	}

}
