package Sorting;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        sort(arr);
        printArray(arr);
    }
    /*
    for sorting the unsorted array
     */
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current )
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;

        }

    }
    /*
    for printing the sorted array
     */
    static void printArray(int [] arr)
    {
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
