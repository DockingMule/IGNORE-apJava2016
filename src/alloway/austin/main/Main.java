package alloway.austin.main;

import java.util.Scanner;

/**
 * Created by Austin on 9/8/2016.
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void printBin(int [] b){

        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");}


    }
    public static int[] addBin(int first[], int second[]){
        int [] list = new int [] {128,64,32,16,8,4,2,1};
        int tempOne = 0;
        int tempTwo=0;
        int sum = 0;
        for(int i = 0; i < first.length; i++){
            if (first[i] == 1){
                tempOne+= list[i];}}
        for(int i = 0; i < second.length; i++){
            if (second[i] == 1){
                tempTwo+= list[i];}}
        sum = tempOne+tempTwo;
        return convertToBinary(sum);
    }

    public static int[] convertToBinary(int initial) {
        int [] list = new int [] {128,64,32,16,8,4,2,1};
        int current = initial;
        int [] binary = new int [] {0,0,0,0,0,0,0,0};
        for (int i = 0; i < list.length; i++){
            if (current<list[i])
                binary[i] = 0;
            else{
                current -= list[i];
                binary[i]=1;}}
        return binary;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number between 0 and 255 to convert to binary:");
        int first = scan.nextInt();
        System.out.println("Please enter another number between 0 and 255 to convert to binary:");
        int second = scan.nextInt();
        System.out.println("First Binary Number: ");
        printBin(convertToBinary(first));
        System.out.println('\n');
        System.out.println("Second Binary Number: ");
        printBin(convertToBinary(second));
        System.out.println('\n');
        System.out.println("Sum of Both Numbers in Binary: ");
        printBin(addBin(convertToBinary(first), convertToBinary(second)));
    }

}
