package leetcode;

import java.util.Scanner;

public class MyCode {
    public static void main(String args[])
    {
        int a;
        int b;
        int[] sum= new int[2];
        for(int i=0;i<2;i++){
            Scanner in=new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
            sum[i]=a+b;
        }
        for(int i=0;i<2;i++){
            System.out.print(sum[i]);
            System.out.print("\n");
        }

    }

}
