import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {

        //�������� ���������� �������
        int[][] array = new int[10][10];
        int firstBit = (int)(System.currentTimeMillis()/10)%10;
        int secondBit = (int)(System.currentTimeMillis()/100)%10;
        for(int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j%2==0) {
                    array[i][j] = Math.abs(((int) System.currentTimeMillis()>>firstBit)%100);
                    firstBit++;
                } else {
                    array[i][j] = Math.abs(((int) System.currentTimeMillis()>>secondBit)%100);
                    secondBit++;
                }
            }
        }

        //����� ������� � �������
        System.out.println("����������� ������");
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("\n");

        int max = 0;
        int min = 10;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(max < array[i][j]) {
                    max = array[i][j];
                }
                if(min > array[i][j]) {
                    min = array[i][j];
                }
                sum += array[i][j];
            }
        }

        //����� ������
        double avg = (double) sum/100;
        System.out.println("������������ �������� " + max);
        System.out.println("����������� �������� " + min);
        System.out.println("������� �������� " + avg);
    }
}
