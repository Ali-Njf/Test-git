import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int arrSize = sc.nextInt();
        int[] array1 = new int[arrSize];
        int[] array2 = new int[arrSize];
        for (int i = 0 ; i <= arrSize - 1 ; i++) {
            System.out.println("Plz enter number of index " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        int i =0;
        for (int j = arrSize - 1 ; j >= 0 ; j--) {
            array2[i] = array1[j];
            i++;
        }
        System.out.print(Arrays.toString(array2));
        }
        }
