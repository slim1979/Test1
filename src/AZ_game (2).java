import java.util.Random;
import java.util.Scanner;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
public class AZ_game {
// Задача создать игру, в которой машина "загадывает" букву A - Z, а пользователь угадывает 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=65, Z=90, z1=0, b2, res=0; 
		char b;
		// присваиваем z рандомное число от 65 до 90
		double z = A+(Math.random()*(Z-A)+1);
				
			if (65<z & z<90) {
				z1 = (int) z;
			}
			else {z+=A;}
		// Буква загадана, начинаем игру	
		Scanner sc = new Scanner(System.in);
		System.out.println("Привет! Я загадал букву! Попробуешь угадать?");
		System.out.print("Введи букву: ");
		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true); //ПРИНУДИТЕЛЬНО ВКЛЮЧАЕМ КАПСЛОК
		b = sc.next().charAt(0);
		b2 = (int)b;
			do{ // проверяем на предмет совпадения
				if(b2<z1) {
				System.out.print("Не угадал! Моя буква \"дальше\"! Попробуй ещё раз!:");
				b = sc.next().charAt(0);
				b2 = (int)b;
				//b2 = (int)b1;
				res++; // считаем количество попыток
					if(b2>z1) {
						System.out.print("Не угадал! Моя буква \"раньше\"! Попробуй ещё раз!:");
						b = sc.next().charAt(0);
						b2 = (int)b;
						//b2 = (int)b1;
						res++; // считаем количество попыток
					}
			
						if (b2==z1) {
							System.out.println("Победа! Ты угадал с " + (res +1)  + " раз.");
							Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
						} 
				}
			}	while (b!=z1); 
			sc.close();
			
		
	} 
}

		
	

	


