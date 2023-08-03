package _2_augest.easy_questions;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-output-formatting
public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();


            //Complete this line
            System.out.print(s1);
            System.out.print(addSpaces(s1.length()));
            if(Integer.toString(x).length()==3)
                System.out.println(x);
            else if(Integer.toString(x).length()==2)
                System.out.println("0" + x);
            else if(Integer.toString(x).length()==1)
                System.out.println("00" + x);
        }
        System.out.println("================================");
    }

    public static String addSpaces(int len){
        len = 14 - len;
        String spaces = " ";
        while(len!=0){
            spaces += " ";
            len--;
        }
        return spaces;
    }
}
