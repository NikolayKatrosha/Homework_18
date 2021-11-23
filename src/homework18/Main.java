package homework18;


public class Main {

    public static void main(String[] args) {
        int[] array = {0, 0, 3, 4, 5, 0, 0, 6, 0};
        int k = 0;
        int a = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[a] = array[i];
                a--;
            }
        }
        while (a >= 0) {
            array[a] = 0;
            a--;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }


        /*for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }*/
    }
}