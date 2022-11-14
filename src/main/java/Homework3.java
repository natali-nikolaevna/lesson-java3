import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {

        //задача 1
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        //задача 2
        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));

        //задача 3
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

        //задача 4
        int[][] arr3 = new int [4][4];
        int lastIndex = arr3.length -1;
        for (int i= 0; i < arr3.length; i++) {
            arr3[1][1] = arr3[1][lastIndex] = 1;
        }
        for (int[] ints : arr3) {
            System.out.println(Arrays.toString(ints));
        }

        //задача 5
        int[] newArray = getNewArray(5, 50);
        System.out.println(Arrays.toString(newArray));
    }
    private static int[] getNewArray(int len, int initialValue) {
        int[]arr = new int [len];
        Arrays.fill(arr,initialValue);
        return arr;
    }

}
