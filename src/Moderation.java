import java.util.Scanner;
public class Moderation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] m = {"бяка", "тряпка", "плот", "компот"};
		
		Scanner sc = new Scanner(System.in);
			System.out.print("Введите текст: ");
				String text = sc.nextLine();
				
		for (int i=0; i<m.length; i++) {
			text = text.replaceAll(m[i], "***");
		}
		System.out.println("Ваш текст после модерации : " +text);
		
		
	}

}
