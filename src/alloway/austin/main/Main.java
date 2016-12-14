package alloway.austin.main;

import java.util.Scanner;

/**
 * Created by Austin on 9/8/2016.
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static boolean allPositive (int list []) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0)
                sum ++;
        }
        if (sum == list.length)
            return true;
            return false;
    }
        public static void main(String[] args) {
            int [] a  = new int [] {1,2,3,4,5};
            allPositive(a);
        }
    }

