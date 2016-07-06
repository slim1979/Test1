
public class MyBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		
		for (a=0; a<125; a++) {		
			
			//System.out.print(a + " = " + Long.toString(a,2));
			//System.out.print("  " +  " = " + Long.toString(a,8));
			//System.out.print("  " + " = " + Long.toString(a,10));
			//System.out.print("  " +  " = 0x" + Long.toString(a,16));
			System.out.println("символ № " + a + "=" + (char) a + " " + (int)((char)a));
			//System.out.println( " c= " + Long.toString(c,10));
		}
	}

}
