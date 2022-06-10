package Day5_3_06;

import java.util.Scanner;

public class Ques30
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();

        }
        System.out.println("array elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"");
        }
        System.out.println("array reverse element");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+"");
        }

    }
}


