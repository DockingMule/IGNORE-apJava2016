package alloway.austin.main;

/**
 * Created by Austin on 12/22/2016.
 */
public class Methods {

/**reverse array*/

            public static void reverse (int list []) {
                int temp;

                for (int i = 0; i < list.length/2; i++){
                    temp = list[i];
                    list[i] = list[list.length-1-i];
                    list[list.length-1-i] = temp;}
            }

/**Insert into array*/

            public static int[] instert(int[] a, int pos, int num) {
                int[] result = new int[a.length];
                for(int i = 0; i < pos; i++)
                    result[i] = a[i];
                result[pos] = num;
                for(int i = pos + 1; i < a.length; i++)
                    result[i] = a[i - 1];
                return result;
            }

/**Average of Array*/

            public static double average (double list []) {
                double tally = 0;
                for (int i = 0; i < list.length; i++) {
                    tally = list[i] + tally;
                }
                return tally;
            }

/**Sum of Array*/

            public static int sum (int list []) {
                int answer = 0;
                for (int i = 0; i < list.length; i++){
                    answer = list[i] + answer;}
                return answer;}

/**Max of Array*/

            public static int findmax (int list []) {
                int max = 0;
                for (int i = 0; i < list.length; i++) {
                    if (i==0)
                        max = list[i];
                    if (list[i] > max)
                        max = list[i];
                }
                return max;
            }

/**Min of Array*/

            public static int findMin (int list []) {
                int min = 0;
                for (int i = 0; i < list.length; i++) {
                    if (i==0)
                        min = list[i];
                    if (list[i] < min)
                        min = list[i];
                }
                return min;
            }

/**Check if All Positive in Array*/

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

/**Change Number into Binary*/

           /** public static void inBinary(int initial) {
                int [] list = new int [] {128,64,32,16,8,4,2,1};
                int current = initial;
                int [] binary = new int [] {0,0,0,0,0,0,0,0};
                for (int i = 0; i < list.length; i++){
                    if (current<list[i])
                        binary[i] = 0;
                    else{
                        current -= list[i];
                        binary[i]=1;}}
                for (int i = 0; i < list.length; i++){
                    System.out.print(binary[i] + " ");}
            }*/
}
