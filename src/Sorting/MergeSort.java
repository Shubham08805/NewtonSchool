package Sorting;
import java.util.Scanner;

public class MergeSort {
    static void conquer(int [] arr,int low,int mid,int high)
    {
        int merge[]=new int[high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=high)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merge[x++]=arr[idx1++];
            }
            else {
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merge[x++]=arr[idx1++];

        }
        while(idx2<=high)
        {
            merge[x++]=arr[idx2++];
        }

        for(int i=0,j=low;i< merge.length;i++,j++)
        {
            arr[j]=merge[i];
        }
    }


    static void divide(int [] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide(arr,low,mid);
            divide(arr,mid+1,high);
            conquer(arr,low,mid,high);
        }
    }
   public static void main(String [] args)
   {
         Scanner sc=new Scanner(System.in);
         int size= sc.nextInt();
         int [] arr=new int[size];
         for(int i=0;i<size;i++)
             arr[i]= sc.nextInt();
         divide(arr,0,size-1);
         for(int i=0;i<size;i++)
             System.out.print(arr[i]+" ");



   }


}
