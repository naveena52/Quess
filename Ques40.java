package Day5_3_06;

import java.util.Scanner;

public class Ques40
{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String of digit :");
            String input = sc.next();
            String result = "";
            for(String s :input.split(""))
            {
                if(Integer.parseInt(s)<5)
                    result+="0";
                else
                    result+="1";
            }
            System.out.println(result);
        }

    }

