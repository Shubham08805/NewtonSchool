package Sorting;
/*
In this algo we find minimum element of the unsorted array and swap it with very first element of
unsorted array
 */
import java.util.Scanner;

public class SelectionSort {
    public static void sort(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        sort(arr);
    }
}
