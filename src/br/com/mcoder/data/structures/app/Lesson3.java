package br.com.mcoder.data.structures.app;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array = {3,5,7,2,4,8};
        printArray(array);
        int[] result = removeEven(array);
        System.out.println("\nRemovendo numeros pares");
        printArray(result);
        int[] reverse = reverseArray(array, 0, array.length - 1);
        System.out.println("\nReverse array");
        printArray(reverse);
    }

    public static int[] removeEven(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]% 2 != 0){
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
    public static int[] reverseArray(int[] array, int start, int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
