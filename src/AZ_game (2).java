import java.util.Random;
import java.util.Scanner;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
public class AZ_game {
// ������ ������� ����, � ������� ������ "����������" ����� A - Z, � ������������ ��������� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=65, Z=90, z1=0, b2, res=0; 
		char b;
		// ����������� z ��������� ����� �� 65 �� 90
		double z = A+(Math.random()*(Z-A)+1);
				
			if (65<z & z<90) {
				z1 = (int) z;
			}
			else {z+=A;}
		// ����� ��������, �������� ����	
		Scanner sc = new Scanner(System.in);
		System.out.println("������! � ������� �����! ���������� �������?");
		System.out.print("����� �����: ");
		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true); //������������� �������� �������
		b = sc.next().charAt(0);
		b2 = (int)b;
			do{ // ��������� �� ������� ����������
				if(b2<z1) {
				System.out.print("�� ������! ��� ����� \"������\"! �������� ��� ���!:");
				b = sc.next().charAt(0);
				b2 = (int)b;
				//b2 = (int)b1;
				res++; // ������� ���������� �������
					if(b2>z1) {
						System.out.print("�� ������! ��� ����� \"������\"! �������� ��� ���!:");
						b = sc.next().charAt(0);
						b2 = (int)b;
						//b2 = (int)b1;
						res++; // ������� ���������� �������
					}
			
						if (b2==z1) {
							System.out.println("������! �� ������ � " + (res +1)  + " ���.");
							Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
						} 
				}
			}	while (b!=z1); 
			sc.close();
			
		
	} 
}

		
	

	


