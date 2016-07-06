import java.util.Scanner;
class SyberForum_2016_07_03 {
 
    public static int[][] createMatrix(int n, int m) {
        int[][] array = new int[n][m];
        for (int[] temp : array) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = (int) (Math.random() * 100 - 20);
            }
        }
        return array;
    }
 
    public static int[][] replaceElement(int[][] array, int n, int m) {
        array[n - 1][m - 1] = array[n - 1][m - 1] * 2;
        return array;
    }
 
    public static void showMatrix(int[][] array) {
        for (int[] temp : array) {
            for (int tmp : temp) {
                System.out.printf("%4d", tmp);
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
 
    public static int[] getUserReply() {
        int[] array = new int[2];
        array[0] = new Scanner(System.in).nextInt();
        array[1] = new Scanner(System.in).nextInt();
        return array;
    }
 
    public static void main(String[] args) {
        System.out.println("Сколько хотите строк/столбцов:");
        int[] userSet = getUserReply();
        int[][] matrix = createMatrix(userSet[0], userSet[1]);
        showMatrix(matrix);
        System.out.println("=========================================");
        System.out.println("Какой элемент меняем?");
        userSet = getUserReply();
        replaceElement(matrix, userSet[0], userSet[1]);
        showMatrix(matrix);
    }
}