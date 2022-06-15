package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();

        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int el=sc.nextInt();
        System.out.println(binarySearch(arr,0,size-1,el));
    }
    static int binarySearch(int [] arr,int low,int high,int d)
    {
        int mid=low+(high-low)/2;
        if(low>high)
            return -1;
        if(arr[mid]==d)
        {
            return mid;
        }
        else if(d<arr[mid])
        {
            return binarySearch(arr,low,mid-1,d);
        }
        else
        {
            return binarySearch(arr,mid+1,high,d);
        }
    }
}
