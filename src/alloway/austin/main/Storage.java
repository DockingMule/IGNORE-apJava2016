package alloway.austin.main;

/**
 * Created by Austin on 12/13/2016.
 */

        import java.util.Scanner;
        import java.util.Arrays;
        import java.util.Scanner;
        import java.util.List;


/*Lessons*/

class Lesson_14_Activity_One{
        System.out.println("Please Enter a Number: ");
    int num1 = scan.nextInt();
    if (num1>=5 && num1<=76){
        System.out.println("False");}
    else
        System.out.println("True");
        }

class Lesson_14_Activity_Two{
    System.out.println("Please enter two integers: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if (num1 >=0 && num2 >=0 )
        System.out.println("Both are positive or zero.");
    else
        System.out.println("One or both are negative.");
            }
class Lesson_14_Activity_Three {
        System.out.println("Please enter the first octet:");
    int num1 = scan.nextInt();
         System.out.println("Please enter the second octet:");
    int num2 = scan.nextInt();
         System.out.println("Please enter the third octet:");
    int num3 = scan.nextInt();
         System.out.println("Please enter the fourth octet:");
    int num4 = scan.nextInt();
    if(num1<0||num1>255)
            System.out.println("Octet 1 is incorrect");
    if(num2<0||num2>255)
            System.out.println("Octet 2 is incorrect");
    if(num3<0||num3>255)
            System.out.println("Octet 3 is incorrect");
    if(num4<0||num4>255)
            System.out.println("Octet 4 is incorrect");
    else
            System.out.println("IP Address: "+num1 +"."+num2 +"."+num3 +"."+num4);
}

class Assignment_2 {
    System.out.println("On what day of the month were your born? (number) ");
    int day = scan.nextInt();
    System.out.println("In which month were you born? (number)");
    int month = scan.nextInt();

    if(month ==1&&(day >=1&&day< 19))

    {
        System.out.println("Your sign is Capricorn");
        System.out.print("Your birthday is: January ");
    }
    else if(month ==1&&(day>=20&&day <=31))

    {
        System.out.println("Your sign is Aquarius");
        System.out.print("Your birthday is: January ");
    }
    else if(month ==2&&(day >18&&day <=31))

    {
        System.out.println("Your sign is Pisces");
        System.out.print("Your Birthday is: February ");
    }
    else if(month ==2&&(day >=1&&day <=18))

    {
        System.out.println("Your sign is Aquarius");
        System.out.print("Your Birthday is: February ");
    }
    else if(month ==3&&(day >20&&day <=31))

    {
        System.out.println("Your sign is Aries");
        System.out.print("Your birthday is: March ");
    }
    else if(month ==3&&(day >=1&&day <=20))

    {
        System.out.println("Your sign is Pisces");
        System.out.print("Your birthday: March ");
    }
    else if(month ==4&&(day >=1&&day<19))

    {
        System.out.println("Your sign is Aries");
        System.out.print("Your birthday: April ");
    }
    else if(month ==4&&(day <=31&&day >19))

    {
        System.out.println("Your sign is Taurus");
        System.out.print("Your birthday is: April ");
    }
    else if(month ==5&&(day >=1&&day <=20))

    {
        System.out.println("Your sign is Taurus");
        System.out.print("Your birthday is: May ");
    }
    else if(month ==5&&(day >=21&&day <=31))

    {
        System.out.println("Your sign is Gemini");
        System.out.print("Your birthday is: May ");
    }
    else if(month ==6&&(day >=1&&day <=20))

    {
        System.out.println("Your sign is Gemini");
        System.out.print("Your birthday is: June ");
    }
    else if(month ==6&&(day >20&&day <=31))

    {
        System.out.println("Your sign is Cancer");
        System.out.print("Your birthday is: June ");
    }
    else if(month ==7&&(day >=1&&day <=22))

    {
        System.out.println("Your sign is Cancer");
        System.out.print("Your birthday is: July ");
    }
    else if(month ==7&(day >22&&day <=31))

    {
        System.out.println("Your sign is Leo");
        System.out.print("Your birthday is: July ");
    }
    else if(month ==8&&(day >22&&day <=31))

    {
        System.out.println("Your sign is Virgo");
        System.out.print("Your birthday is: August ");
    }
    else if(month ==8&&(day >=1&&day <=22))

    {
        System.out.println("Your sign is Leo");
        System.out.print("Your birthday is: August ");
    }
    else if(month ==9&&(day >=1&&day <=22))

    {
        System.out.println("Your sign is Virgo");
        System.out.print("Your birthday is: September ");
    }
    else if(month ==9&&(day >22&&day <=31))

    {
        System.out.println("Your sign is Libra");
        System.out.print("Your birthday is: September ");
    }
    else if(month ==10&&(day >22&&day <=31))

    {
        System.out.println("Your sign is Scorpio");
        System.out.print("Your birthday is: October ");
    }
    else if(month ==11&&(day >21&&day <=31))

    {
        System.out.println("Your sign is Sagittarius");
        System.out.print("Your birthday is: November ");
    }
    else if(month ==12&&(day >21&&day <=31))

    {
        System.out.println("Your sign is Capricorn");
        System.out.print("Your birthday is: December ");
    }
    else if(month ==12&&(day >=1&&day <=21))

    {
        System.out.println("Your sign is Sagittarius");
        System.out.print("Your birthday is: December ");
    }
    else
            System.out.println("error");
    if(day ==1)
            System.out.println("first");
    else if(day ==2)
            System.out.println("second");
    else if(day ==3)
            System.out.println("third");
    else if(day ==4)
            System.out.println("fourth");
    else if(day ==5)
            System.out.println("fifth");
    else if(day ==6)
            System.out.println("sixth");
    else if(day ==7)
            System.out.println("seventh");
    else if(day ==8)
            System.out.println("eighth");
    else if(day ==9)
            System.out.println("ninth");
    else if(day ==10)
            System.out.println("tenth");
    else if(day ==11)
            System.out.println("eleventh");
    else if(day ==12)
            System.out.println("twelfth");
    else if(day ==13)
            System.out.println("thirteenth");
    else if(day ==14)
            System.out.println("fourteenth");
    else if(day ==15)
            System.out.println("fifteenth");
    else if(day ==16)
            System.out.println("sixteenth");
    else if(day ==17)
            System.out.println("seventeenth");
    else if(day ==18)
            System.out.println("eighteenth");
    else if(day ==19)
            System.out.println("nineteenth");
    else if(day ==20)
            System.out.println("twentieth");
    else if(day ==21)
            System.out.println("twenty-first");
    else if(day ==22)
            System.out.println("twenty-second");
    else if(day ==23)
            System.out.println("twenty-third");
    else if(day ==24)
            System.out.println("twenty-fourth");
    else if(day ==25)
            System.out.println("twenty-fifth");
    else if(day ==26)
            System.out.println("twenty-sixth");
    else if(day ==27)
            System.out.println("twenty-seventh");
    else if(day ==28)
            System.out.println("twenty-eighth");
    else if(day ==29)
            System.out.println("twenty-ninth");
    else if(day ==30)
            System.out.println("thirtieth");
    else if(day ==31)
            System.out.println("thirty-first");
    else
            System.out.println("error");
    if(month ==1&&(day >=1&&day< 19)||(month ==12&&(day >=1&&day <=21)))
            System.out.print("Horoscope: A very welcome sum of extra money could come your way today, possibly out of the blue.");
    else if((month ==1&&(day <=31&&day >=20)||(month ==2&&(day >=1&&day <=18))))
            System.out.println("Horoscope: Today you may feel especially warm and loving toward just about everybody in your circle, Aquarius, even those you usually find irritating.");
    else if((month ==2&&(day >18&&day <=31))||(month ==3&&(day >=1&&day <=19)))
            System.out.println("Horoscope: Someone you care about but haven't seen for a long time could suddenly contact you.");
    else if((month ==4&&(day<19&&day >=1))||(month ==3&&(day >21&&day <=31)))
            System.out.println("Horoscope: A goal that you've been working on could finally be reached, Aries.");
    else if((month ==4&&(day <=31&&day >=19))||(month ==5&&(day >=1&&day <=20)))
            System.out.println("Horoscope: Today you could meet some interesting new people, Taurus.");
    else if(month ==5&&(day >20&&day <=31)||(month ==6&&(day >=1&&day <=20)))
            System.out.println("Horoscope: A book or movie about a foreign country could capture your imagination and make that country seem especially appealing, Gemini.");
    else if(month ==6&&(day >20&&day <=31)||(month ==7&&(day >=1&&day <=20)))
            System.out.println("Horoscope: Someone close who owes you money might suddenly turn up and repay you, Cancer. ");
    else if(month ==7&(day >20&&day <=31)||(month ==8&&(day >=1&&day <=22)))
            System.out.println("Horoscope: Today you should feel especially warm and loving toward everyone close to you, Leo, particularly a love partner.");
    else if(month ==8&&(day >22&&day <=31)||(month ==9&&(day >=1&&day <=22)))
            System.out.println("Horoscope: You should be looking especially attractive today and glowing with robust health, Virgo. ");
    else if(month ==9&&(day >22&&day <=31)||(month ==10&&(day >=1&&day <=22)))
            System.out.println("Horoscope: Today you should be feeling especially warm and loving toward close friends and children, Libra. ");
    else if(month ==10&&(day >22&&day <=31)||(month ==11&&(day >=1&&day <=21)))
            System.out.println("Horoscope: Today you might decide to buy a plant for every room in your house or plant a garden, Scorpio.");
    else if(month ==11&&(day >21&&day <=31))
            System.out.println("Horoscope: A warm and loving communication could come to you today from someone close.");
    else if(month ==12&&(day >=1&&day <=21))
            System.out.println("Horoscope: A warm and loving communication could come to you today from someone close.");
}
class Lesson_17_Activity_One {
        System.out.println("Please enter test scores (enter -1 to stop):");
    double count = -1;
    double average = 1;
    double input = 0;
    while(input !=(-1))

    {
        input = scan.nextDouble();
        count++;
        average = (average + input);
    }
        System.out.println(average/count);
}
class Lesson_17_Activity_Two{
System.out.println("Please enter two numbers");
int e = scan.nextInt();
int x = scan.nextInt();

    while (e <= x){
        {
            if (e % 2 == 0) {
                System.out.print(e + " ");
                e += 2;
            }

            if (e % 2 == 1) {
                e++;
                System.out.print(e + " ");
                e += 2;

                double lon = 0;
                double lat = 0;
                double maxlat = -90;
                double maxlon = -180;
                double minlat = 90;
                double minlon = 180;
                int input = 1;
                while (input == 1) {
                    System.out.println("Please enter the latitude:");
                    lat = scan.nextDouble();
                    System.out.println("Please enter the longitude");
                    lon = scan.nextDouble();
                    if ((lat < -90 || lat > 90) || (lon < -180 || lon > 180)) {
                        System.out.println("Incorrect Latitude or Longitude");
                    } else {
                        System.out.println("Would you like to enter another location?");
                        input = scan.nextInt();
                        if (lat > maxlat)
                            maxlat = lat;
                        if (lon > maxlon)
                            maxlon = lon;
                        if (lon < minlon)
                            minlon = lon;
                        if (lat < minlat)
                            minlat = lat;
                    }
                }
                System.out.println("Farthest North: " + maxlat);
                System.out.println("Farthest South: " + minlat);
                System.out.println("Farthest East: " + maxlon);
                System.out.println("Farthest West: " + minlon);
            }
        }}
        class Lesson_22_Activity_One {
            Scanner scan = new Scanner(System.in);
            String v;
            int x;
        System.out.println("Please enter a string:");
            v =scan.nextLine();
            x =(v.length());
            int y = 0;
        while(y<x)

            {
                System.out.println(v.charAt(y));
                y++;
            }
        }

/*    System.out.println("Please enter a tweet:");
        String tweet = scan.nextLine();

        if (tweet.length() > 140) {
            System.out.println("Excess Characters: " + (tweet.length() - 140));}
        else{
            System.out.println("Length Correct");

            int hashtags = 0;
            int mentions = 0;
            String tweetRetweet = "The input was not a retweet.";
            char tweetLastChar = tweet.charAt(tweet.length() - 1);

            for (int i = 0; i < tweet.length(); i++) {
                if (tweet.charAt(i) == '#' || tweet.charAt(i) == '@') {
                    if (i != (tweet.length() - 1)) {
                        if (!(tweet.charAt(i + 1) == '\t' || tweet.charAt(i + 1) == ' ')) {
                            if (tweet.charAt(i) == '#')
                                hashtags++;
                            else if (tweet.charAt(i) == '@')
                                mentions++;
                        }
                    }
                }
            }
            if (tweet.contains("RT:") || tweet.contains("rt:")) {
                if (tweet.indexOf("RT:") == tweet.lastIndexOf("RT:"))
                    tweetRetweet = "The input was a retweet.";}
            System.out.println("Number of Mentions: " + mentions);
            System.out.println("Number of Hashtags: " + hashtags);
            System.out.println(tweetRetweet);}
}*/
class Lesson_24_Activity_One{
for (int loopCurrent = 23, loopCurrentTwo = 1; loopCurrent <= 89; loopCurrent++, loopCurrentTwo++) {
            System.out.print(loopCurrent + " ");
            if (loopCurrentTwo % 10 == 0)
                System.out.print("\n");}
class Lesson_24_Activity_Two{
  for (int i = 1; i <= 50; i++){
            if ((i%2) == 0)
                System.out.println(i);}
class Lesson_24_Activity_Three{
int x = scan.nextInt();
        if (x >100 || x <0)
            System.out.println("error");
        else{
            for (int y = x; y <=100; y++){
                System.out.print(y +" ");
                if (y % 20 == 0)
                    System.out.print("\n");
            } }}
 class Lesson_29_Activity_One{
 public static String [] list = {};
    public static void main(String[] args) {
        String longest = "";
        for (int i = 0; i < list.length; i++){
                if (list[i].length() > longest.length()){
                    longest = list[i];}}
        System.out.println(longest);}}

class Lesson_29_Activity_Two{
        public static String [] list = {};
    public static void main(String[] args) {
        for (int i = 0; i < list.length; i++){
            for(int c = list[i].length()-1; c>=0; c--){
                System.out.print(list[i].charAt(c));}
        System.out.println();}}}

class Lesson_30_Activity{
 public static String [] list = {};
    public static void main(String[] args) {
        for (int i = 0; i < list.length; i ++) {
            for (int c = 0; c < list[i].length(); c++) {
                if (list[i].charAt(c) == ' ') {
                    list[i] = list[i].replace(" ", "");
                    public class Main {
    public static void monthName(int monthNumber){
        String months []={"January", "February","March","April","May","June","July","August","September","October","November","December"};
        for (int i = 0; i <= months.length; i++){
            if (monthNumber == i)
                System.out.print(months[i-1]);
        }
            if (monthNumber<1 || monthNumber>months.length)
            System.out.println("Not Valid Month!");
    }}}}}}}
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a month (number): ");
        int monthNumber = scan.nextInt();
        monthName(monthNumber);
        }
    }
        public static void swap(int x , int y){
        System.out.println(y+ " " +x);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Two Numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        swap(x, y);
        }
    }
*/

//on hold
/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in base 8: ");
        int input = scan.nextInt();
        int answer = 0;
        String inputLength = Integer.toString(input);
        int length = inputLength.length();
        int a = 1;
        for (int i = 0; i < length; i++) {
            int v = (input / (a)) % 10;
            int u = 8 ^ i;
            answer = (v * u) + answer;
            a = a*10;}
        System.out.println(answer);
    }
}
 public static void realTime(int seconds){
        int remainingSeconds = seconds;
        int hours = (remainingSeconds/3600);
        remainingSeconds = (remainingSeconds%3600);
        int minutes = (remainingSeconds/60);
        remainingSeconds = (remainingSeconds%60);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: "+minutes);
        System.out.println("Seconds: "+remainingSeconds);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Amount of Second:");
        int seconds = scan.nextInt();
        realTime(seconds);
        public class Main {

    public static void upper (String c []) {
        for (int i = 0; i < c.length; i++){
            c[i] = c[i].toUpperCase();
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        String list [] = {"blue","greene"};
        upper(list);
        }
    }
        public static void randomize (int c []) {
        for (int i = 0; i < c.length; i++){
            c[i]=(int)(Math.random()*90+10);
            System.out.println(c[i]);
        }
    }
    public static void main(String[] args) {
        int [] list = new int [] {1,2,3,4,5,6,6};
        randomize(list);
        }
        }*/
class Lesson_33_Activity_Four {
    public static void reverse (int list []) {
        int temp;

        for (int i = 0; i < list.length/2; i++){
            temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;}
    }
    public static void main(String[] args) {
        int [] list = new int [] {1,2,3,4,5,6,6};
        reverse(list);
    }
}
class Lesson_33_Activity_Five {
    public static void insertValue (int list [], int a, int b) {
        for (int i = 0; i < list.length; i++){
            if (i <b){
                list[(list.length-1)-i] = list[(list.length-2)-i];}

            else if (i == b)
                list[i] = a;
            else
                list[i]= list[i];
            System.out.print(list[i]+" ");
        }}
    public static void main(String[] args) {
        int [] a  = new int [] {1,2,3,4,5};
        insertValue(a, 69, 2);}}

class Lesson_33_Activity_Six {
    public static double average (double list []) {
        double tally = 0;
        for (int i = 0; i < list.length; i++){
            tally = list[i] + tally;
        }
        double average = tally/list.length;
        return average;}
    public static void main(String[] args) {
        double [] a  = new double [] {1,2,3,4,5};
        average(a);
    }}

class Lesson_34_Activity_One {
    public static int sum (int list []) {
        int answer = 0;
        for (int i = 0; i < list.length; i++){
            answer = list[i] + answer;}
        return answer;}
    public static void main(String[] args) {
        int [] a  = new int [] {1,2,3,4,5};
        sum(a);
    }
}

class Lesson_34_Activity_Two {
    public static double average (int list []) {
        int tally = 0;
        for (int i = 0; i < list.length; i++){
            tally = list[i] + tally;
        }
        double average = tally/list.length;
        return average;}
    public static void main(String[] args) {
        int [] a  = new int [] {1,2,3};
        average(a);
    }
}
class Lesson_34_Activity_Three {
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
    public static void main(String[] args) {
        int [] a  = new int [] {1,2,3,4,5};
        findmax(a);
    }}
class Lesson_34_Activity_Four {
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
    public static void main(String[] args) {
        int [] a  = new int [] {1,2,3};
        findMin(a);
    }
}


class Lesson_34_Activity_Five {
    public static int sumEven (int list []) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]%2 == 0)
                sum = sum + list[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] a  = new int [] {1,2,3,4,5};
        sumEven(a);
    }
}

class Lesson_34_Activity_Six {
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
}}}}

