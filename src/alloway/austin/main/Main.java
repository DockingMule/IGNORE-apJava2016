package alloway.austin.main;




import java.io.*;

import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.ArrayList;



public class Main{
//Term 2 Lesson 1: ArrayList

    public static void main (String str[]) throws IOException {
        ArrayList list  = new ArrayList ();
        int get;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(!(list.contains("stop"))){
            String temp = scanner.nextLine();
            list.add(temp);
            count++;
        }

        list.remove(count-1);
        System.out.println(list);

        if(list.size()>2){
            list.remove(0);
            list.remove(list.size()-1);}
        System.out.print(list);
        }

    }


