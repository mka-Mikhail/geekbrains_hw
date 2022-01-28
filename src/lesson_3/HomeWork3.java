package lesson_3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        //1
        int[] array1 = {1, 0, 1, 1, 0, 1, 0};
        System.out.println("№1\n" + Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1)
                array1[i] = 0;
            else
                array1[i] = 1;
        }
        System.out.println(Arrays.toString(array1));

        //2
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        System.out.println("\n№2\n" + Arrays.toString(array2));


        //3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n№3\n" + Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6)
                array3[i] *= 2;
        }
        System.out.println(Arrays.toString(array3));

        //4
        int length = 6, col = 0;
        int[][] array4 = new int[length][length];
        for (int i = 0; i < length; i++) {
            array4[i][i] = 1;
        }
        for (int i = length - 1; i >= 0; i--) {
            array4[i][col] = 1;
            col++;
        }
        System.out.print("\n№4");
        for (int i = 0; i < length; i++) {
            System.out.println();
            for (int j = 0; j < length; j++) {
                System.out.print(array4[i][j] + " ");
            }
        }

        //5
        System.out.println("\n\n№5\n" + Arrays.toString(printArray(5, 7)));

        //6
        length = 10;
        int[] array6 = new int[length];
        for (int i = 0; i < length; i++) {
            array6[i] = (int) (Math.random() * 100 + 0);
        }
        Arrays.sort(array6);
        System.out.println("\n№6\nМинимальный элемент - " + array6[0] + "\nМаксимальный элемент - " + array6[length - 1]);

        //7
        int[] array7 = {18, 12, 0, 33, -4};
        System.out.println("\n№7\n" + checkBalance(array7));

        //8
        length = 10;
        int[] array8 = new int[length];
        for (int i = 0; i < array8.length; i++) {
            array8[i] = i + 1;
        }
        System.out.println("\n№8");
        offsetArray(array8, -2);
    }

    //5
    public static int[] printArray(int initialValue, int len) {
        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
        }
        return a;
    }

    //7
    public static boolean checkBalance(int[] array) {
        int sumLeft = 0, sumRight = 0, k = 0;

        for (int i = 0; i < array.length; i++) {
            sumRight += array[i];
        }

        while (sumLeft != sumRight && k < array.length) {
            sumRight -= array[k];
            sumLeft += array[k];
            k++;
        }
        return (sumLeft == sumRight);
    }

    //8
    public static void offsetArray(int[] array, int n) {
        int hold;
        System.out.println(Arrays.toString(array));

        if (n > 0){
            for (int i = 1; i <= n; i++) {
                hold = array[array.length-1];
                for (int j = array.length-1-1; j >= 0; j--) {
                    array[j+1] = array[j];
                }
                array[0] = hold;
            }
            System.out.println(Arrays.toString(array));
        }

        else if (n < 0) {
            for (int i = -1; i >= n; i--) {
                hold = array[0];
                for (int j = 0; j <= array.length-1-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = hold;
            }
            System.out.println(Arrays.toString(array));
        }

        else
            System.out.println(Arrays.toString(array));
    }
}
