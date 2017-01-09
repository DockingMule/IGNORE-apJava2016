package alloway.austin.main;




import java.io.*;

import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.ArrayList;



public class Main{
//Term 2 Lesson 1: ArrayList

    public static void main (String str[]) throws IOException {
        ArrayList <String> list  = new <String> ArrayList ();
        int get;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String temp = scan.nextLine();
            if(!(temp=="stop"))
                list.add(temp);
            count++;}
        for(String b: list){
            if (b.indexOf('a') != -1)
                System.out.println(b);
        }
    }

}


