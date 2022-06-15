package MentorCatchUp;

import java.util.Scanner;

public class wordReverseOrder {
    static void stringWordReverseOrder(String str)
    {
        int n=str.length()-1;
        int i=n;
        String result="";
        int start=0,end=i+1;
        while(i>0)
        {
            if(str.charAt(i)==' ')
            {
                start=i+1;

                for(int j=start;j<end;j++)
                  result+=str.charAt(start++);
                result+=' ';
                end=i;
            }
            i--;
        }
        start=0;
        for(int j=start;j<end;j++)
            result+=str.charAt(j);


            System.out.println(result);

    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        stringWordReverseOrder(str);

    }
}
