package Sorting;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        sort(arr);
        printArray(arr,size);
    }

    /*
    * For printing the sorted array
    * */
    static void printArray(int [] arr, int size)
    {
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }

/*
* For sorting the unsorted array
* */
    static void sort(int [] arr) {
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}

