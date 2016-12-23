package alloway.austin.main;

/**
 * Created by Austin on 12/22/2016.
 */
public class Methods {

//----------------------------------------------------------------------
//SOME METHODS USE OTHER METHODS MAKE SURE YOU COPY ALL THAT YOU NEED!!!
//----------------------------------------------------------------------

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
                return answer;
            }

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

/**Add Two Binary Arrays*/

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

/**Check if over 255*/

            public static void checkOverflow(int x){
                if (x>255)
                    System.out.println("Error: overflow");
                else
                    printArray(convertToBinary(x));
            }

/**Prints Out An Array*/

            public static void printArray(int [] b) {
                for (int i = 0; i < b.length; i++) {
                    System.out.print(b[i] + " ");
                }
            }

}
