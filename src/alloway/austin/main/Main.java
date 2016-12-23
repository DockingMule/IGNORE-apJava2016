package alloway.austin.main;

import java.util.Scanner;

/**
 * Created by Austin on 9/8/2016.
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {


    public static void inBinary(int initial) {
        int [] list = new int [] {128,64,32,16,8,4,2,1};
        int current = initial;
        int [] binary = new int [] {0,0,0,0,0,0,0,0};
        for (int i = 0; i < list.length; i++){
            if (current<list[i])
                binary[i] = 0;
            else{
                current -= list[i];
                binary[i]=1;
            }
        }
        for (int i = 0; i < list.length; i++){
            System.out.print(binary[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        inBinary(a);
    }
}
