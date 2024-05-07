import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        printArray(sortIntegers(getIntegers(7)));
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);

        int[] sortArray = new int[size];

        boolean test = true;

        while(test) {
            try{
                System.out.println("Enter " + size + " integers for the array");
                for(int i = 0; i < size; i++) {
                    sortArray[i] = scanner.nextInt();
                }
                test = false;
            } catch(NumberFormatException nfe) {
                System.out.println("Enter valid input do not enter alphabets");
            }
        }

        return sortArray;
    }

    public static int[] sortIntegers(int[] array) {

        int[] newArray = Arrays.copyOf(array, array.length);
        boolean test = true;

        while(test) {
            test = false;

            for(int i = 0; i < (newArray.length - 1); i++) {
                if(newArray[i] < newArray[i + 1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    test = true;
                }
            }
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
