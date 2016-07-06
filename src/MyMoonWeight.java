import java.util.Scanner;
public class MyMoonWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите свой вес на Земле:");
		int ves1 = sc.nextInt();
		double ves2 = ves1*0.17;
		System.out.println("Ваш вес на Луне: " + ves2 +" кг");
	}

}
