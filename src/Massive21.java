import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Massive21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i,j,strok,stolb;
		int num=0;
		int [] load = {124,47,45,92};
		// ���������� ������������ ������ ��������� ������ �������
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������� ��� ������. ��� ����� ������� ���������� ����� � ��������:");
			System.out.print("������� ���������� �����: ");				
				strok = sc1.nextInt();			// �������� ���������� �����
			System.out.print("������� ���������� ��������: ");				
				stolb = sc1.nextInt();	        // �������� ���������� ��������
			System.out.print("������� �������� 1-�� ��������: ");	
				num = sc1.nextInt();			// �������� �������� 1-�� ��������
			double[][] m = new double[strok][stolb];	// ������� ������ �� ��������� ������	
		for (i=0; i<strok; i++) {				// ����������� �������� ��������� �������
			for(j=0; j<stolb; j++) 
				m [i][j] = num*(i+1)*(j+1);
				++num;				
		}
		// �������� ����������� ������������� ��������� ������� � ��������� ������� ����� � ��������
		for (int verx = -1; verx<stolb; verx++) { // �������� �������
			if (verx==-1) {
				System.out.print(" " + "\t" );	
			}
			else 
				System.out.print(verx+ "\t");				
			}									
		System.out.println();
		for (i=0; i<strok; i++) {				// ������� ������ �� �����
			System.out.print(i + "\t");			// �������� ������
			for(j=0; j<stolb; j++) 
				System.out.print(m[i][j]+ "\t");
				System.out.println();
		}
		// ����������� ������� �������, ��������� � ���������
		System.out.println("�������� �������, ������� ������ ��������� �� 18%. ");
			System.out.print("������� ������: ");				
				int strok1 = sc1.nextInt();
			System.out.print("������� �������: ");				
				int stolb1 = sc1.nextInt();
						
			System.out.print("�� ������� " + m[strok1][stolb1] + ". ����������� ��� �� 18% ");
			m[strok1][stolb1]=m[strok1][stolb1]*1.18; // �������� �������� �������� �������  � ����������� ���
			m[strok1][stolb1] = new BigDecimal(m[strok1][stolb1]).setScale(2, RoundingMode.UP).doubleValue();// ��������� �� 2-� ������ ����� �������
			for (int t=0; t<100; t++) {	// ��������� ����������� :) �� ��������, �� �� ��...
				//System.out.print(" ");
				for (int q=0; q<4; q++, Thread.sleep(100)){
				System.out.print((char) load[q]);
				System.out.print("\b");
				//System.out.print(" ");
				}
				}
				System.out.println();
				System.out.println("������ ��� ������ �������� ���:");
				
				for (int verx = -1; verx<stolb; verx++) { // �������� ������� ������ �������
					if (verx==-1) {
						System.out.print(" " + "\t" );	
					}
					else 
						System.out.print(verx+ "\t");	
				}
				System.out.println();
				for (i=0; i<strok; i++) {					// ������� ������ �� �����
					System.out.print(i + "\t");				// �������� ������ ������ �������
				
					for(j=0; j<stolb; j++) 						
						System.out.print(m[i][j]+ "\t");
						System.out.println();
						sc1.close();
				}
			}

				
	}

	
		


