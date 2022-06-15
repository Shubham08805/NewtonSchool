package Mock.Interview;
import java.util.Scanner;

public class missingNumber {
    static  int findmissingNumber(int[] arr)
    {
        int n= arr.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=arr[i];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findmissingNumber(arr));


    }
}
