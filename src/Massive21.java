import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Massive21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i,j,strok,stolb;
		int num=0;
		int [] load = {124,47,45,92};
		// Предлагаем пользователю задать параметры нового массива
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Создайте Ваш массив. Для этого введите количество строк и столбцов:");
			System.out.print("Введите количество строк: ");				
				strok = sc1.nextInt();			// получаем количество строк
			System.out.print("Введите количество столбцов: ");				
				stolb = sc1.nextInt();	        // получаем количество столбцов
			System.out.print("Задайте значение 1-го элемента: ");	
				num = sc1.nextInt();			// получаем значение 1-го элемента
			double[][] m = new double[strok][stolb];	// Создаем массив из введенных данных	
		for (i=0; i<strok; i++) {				// присваиваем значения элементам массива
			for(j=0; j<stolb; j++) 
				m [i][j] = num*(i+1)*(j+1);
				++num;				
		}
		// Начинаем формировать удобочитаемую структуру массива с указанием номеров строк и столбцов
		for (int verx = -1; verx<stolb; verx++) { // Нумеруем столбцы
			if (verx==-1) {
				System.out.print(" " + "\t" );	
			}
			else 
				System.out.print(verx+ "\t");				
			}									
		System.out.println();
		for (i=0; i<strok; i++) {				// выводим массив на экран
			System.out.print(i + "\t");			// нумеруем строки
			for(j=0; j<stolb; j++) 
				System.out.print(m[i][j]+ "\t");
				System.out.println();
		}
		// запрашиваем элемент массива, требуемый к изменению
		System.out.println("Выберите элемент, который хотите увеличить на 18%. ");
			System.out.print("Введите строку: ");				
				int strok1 = sc1.nextInt();
			System.out.print("Введите столбец: ");				
				int stolb1 = sc1.nextInt();
						
			System.out.print("Вы выбрали " + m[strok1][stolb1] + ". Увеличиваем его на 18% ");
			m[strok1][stolb1]=m[strok1][stolb1]*1.18; // получаем значение элемента массива  и увеличиваем его
			m[strok1][stolb1] = new BigDecimal(m[strok1][stolb1]).setScale(2, RoundingMode.UP).doubleValue();// округляем до 2-х знаков после запятой
			for (int t=0; t<100; t++) {	// небольшие спецэффекты :) не голливуд, но всё же...
				//System.out.print(" ");
				for (int q=0; q<4; q++, Thread.sleep(100)){
				System.out.print((char) load[q]);
				System.out.print("\b");
				//System.out.print(" ");
				}
				}
				System.out.println();
				System.out.println("Теперь Ваш массив выглядит так:");
				
				for (int verx = -1; verx<stolb; verx++) { // Нумеруем столбцы нового массива
					if (verx==-1) {
						System.out.print(" " + "\t" );	
					}
					else 
						System.out.print(verx+ "\t");	
				}
				System.out.println();
				for (i=0; i<strok; i++) {					// выводим массив на экран
					System.out.print(i + "\t");				// нумеруем строки нового массива
				
					for(j=0; j<stolb; j++) 						
						System.out.print(m[i][j]+ "\t");
						System.out.println();
						sc1.close();
				}
			}

				
	}

	
		


