package Day5_3_06;

import java.util.Scanner;

public class Ques31
 {
    public static void main(String[] args) {
        int a[] = new int [5];
        int b[] = new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value in first array :");
        for (int i = 0; i<5;i++) {
            a[i]=r.nextInt();
        }
        System.out.println(" First  array Elements: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Second array Elements ");
        for (int i = 0; i < 5; i++) {
            b[i]=a[i];
            System.out.print(b[i]+"");
        }
    }
}

