import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        System.out.println(Arrays.toString(array));
        int temp = 0;
        int normCount = 0;
        while (normCount != array.length) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                } else {
                    normCount++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
