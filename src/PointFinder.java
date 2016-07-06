import java.util.Scanner;
public class PointFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,spp=0,y=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите символы:");
		String vvod = sc.nextLine();
		char [] vArray = vvod.toCharArray();
		for (i=0; i<vvod.length(); i++) {
			if(vArray[i] == '.') {
			y++;
			} 
			if(vArray[i] == ' ') {
				spp++;
				} 	
		}
			System.out.println("В тексте, длинной в " + vvod.length() + " символов, было " + y + " точек и " + spp + " пробелов");
			sc.close();
	}
}
