package alloway.austin.main;

/**
 * Created by Austin on 9/8/2016.
 */

/*Lessons*/

/*Lesson_14_Activity_One
        System.out.println("Please Enter a Number: ");
    int num1 = scan.nextInt();
    if (num1>=5 && num1<=76){
        System.out.println("False");}
    else
        System.out.println("True");

Lesson_14_Activity_Two
    System.out.println("Please enter two integers: ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if (num1 >=0 && num2 >=0 )
        System.out.println("Both are positive or zero.");
    else
        System.out.println("One or both are negative.");

Lesson_14_Activity_Three
        System.out.println("Please enter the first octet:");
    int num1 = scan.nextInt();
         System.out.println("Please enter the second octet:");
    int num2 = scan.nextInt();
         System.out.println("Please enter the third octet:");
    int num3 = scan.nextInt();
         System.out.println("Please enter the fourth octet:");
    int num4 = scan.nextInt();
    if (num1<0 || num1>255)
         System.out.println("Octet 1 is incorrect");
    if (num2<0 || num2>255)
         System.out.println("Octet 2 is incorrect");
    if (num3<0 || num3>255)
         System.out.println("Octet 3 is incorrect");
    if (num4<0 || num4>255)
         System.out.println("Octet 4 is incorrect");
    else
         System.out.println("IP Address: " + num1 + "." + num2 + "." + num3 + "." + num4);


Assignment_2
    System.out.println("On what day of the month were your born? (number) ");
    int day = scan.nextInt();
    System.out.println("In which month were you born? (number)");
    int month = scan.nextInt();

    if (month == 1 && (day >= 1 && day < 19)){
        System.out.println("Your sign is Capricorn");
        System.out.print("Your birthday is: January ");}
    else if (month == 1 && (day>=20 && day <=31)){
        System.out.println("Your sign is Aquarius");
        System.out.print("Your birthday is: January ");}
    else if (month == 2 && (day > 18 && day <= 31)){
        System.out.println("Your sign is Pisces");
        System.out.print("Your Birthday is: February ");}
    else if (month == 2 && (day >= 1 && day <= 18)){
        System.out.println("Your sign is Aquarius");
        System.out.print("Your Birthday is: February ");}
    else if (month == 3 && (day > 20 && day <= 31)){
        System.out.println("Your sign is Aries");
        System.out.print("Your birthday is: March ");}
    else if (month == 3 && (day >=1 && day <=20)){
        System.out.println("Your sign is Pisces");
        System.out.print("Your birthday: March ");}
    else if (month == 4 && (day >= 1 && day <19)){
        System.out.println("Your sign is Aries");
        System.out.print("Your birthday: April ");}
    else if (month == 4&&(day <=31 && day >19)){
        System.out.println("Your sign is Taurus");
        System.out.print("Your birthday is: April ");}
    else if (month == 5&&(day >=1 && day <=20)){
        System.out.println("Your sign is Taurus");
        System.out.print("Your birthday is: May ");}
    else if (month == 5 &&(day >= 21 && day <= 31)){
        System.out.println("Your sign is Gemini");
        System.out.print("Your birthday is: May ");}
    else if (month == 6&&(day >=1 && day <=20)){
        System.out.println("Your sign is Gemini");
        System.out.print("Your birthday is: June ");}
    else if (month == 6&&(day > 20 && day <= 31)){
        System.out.println("Your sign is Cancer");
        System.out.print("Your birthday is: June ");}
    else if (month == 7&&(day >=1 && day <=22)){
        System.out.println("Your sign is Cancer");
        System.out.print("Your birthday is: July ");}
    else if (month == 7&(day > 22 && day <= 31)){
        System.out.println("Your sign is Leo");
        System.out.print("Your birthday is: July ");}
    else if (month == 8&&(day > 22 && day <= 31)){
        System.out.println("Your sign is Virgo");
        System.out.print("Your birthday is: August ");}
    else if (month == 8&&(day >=1 && day <=22)){
        System.out.println("Your sign is Leo");
        System.out.print("Your birthday is: August ");}
    else if (month == 9&&(day >=1 && day <=22)){
        System.out.println("Your sign is Virgo");
        System.out.print("Your birthday is: September ");}
    else if (month == 9&&(day > 22 && day <= 31)){
        System.out.println("Your sign is Libra");
        System.out.print("Your birthday is: September ");}
    else if (month == 10&&(day > 22 && day <= 31)){
        System.out.println("Your sign is Scorpio");
        System.out.print("Your birthday is: October ");}
    else if (month == 11&&(day > 21 && day <= 31)){
        System.out.println("Your sign is Sagittarius");
        System.out.print("Your birthday is: November ");}
    else if (month == 12&&(day > 21 && day <= 31)){
        System.out.println("Your sign is Capricorn");
        System.out.print("Your birthday is: December ");}
    else if (month == 12&&(day >=1 && day <=21)){
        System.out.println("Your sign is Sagittarius");
        System.out.print("Your birthday is: December ");}
    else
        System.out.println("error");
    if (day == 1)
        System.out.println("first");
    else if (day == 2)
        System.out.println("second");
    else if (day == 3)
        System.out.println("third");
    else if (day == 4)
        System.out.println("fourth");
    else if (day == 5)
        System.out.println("fifth");
    else if (day == 6)
        System.out.println("sixth");
    else if (day == 7)
        System.out.println("seventh");
    else if (day == 8)
        System.out.println("eighth");
    else if (day == 9)
        System.out.println("ninth");
    else if (day == 10)
        System.out.println("tenth");
    else if (day == 11)
        System.out.println("eleventh");
    else if (day == 12)
        System.out.println("twelfth");
    else if (day == 13)
        System.out.println("thirteenth");
    else if (day == 14)
        System.out.println("fourteenth");
    else if (day == 15)
        System.out.println("fifteenth");
    else if (day == 16)
        System.out.println("sixteenth");
    else if (day == 17)
        System.out.println("seventeenth");
    else if (day == 18)
        System.out.println("eighteenth");
    else if (day == 19)
        System.out.println("nineteenth");
    else if (day == 20)
        System.out.println("twentieth");
    else if (day == 21)
        System.out.println("twenty-first");
    else if (day == 22)
        System.out.println("twenty-second");
    else if (day == 23)
        System.out.println("twenty-third");
    else if (day == 24)
        System.out.println("twenty-fourth");
    else if (day == 25)
        System.out.println("twenty-fifth");
    else if (day == 26)
        System.out.println("twenty-sixth");
    else if (day == 27)
        System.out.println("twenty-seventh");
    else if (day == 28)
        System.out.println("twenty-eighth");
    else if (day == 29)
        System.out.println("twenty-ninth");
    else if (day == 30)
        System.out.println("thirtieth");
    else if (day == 31)
        System.out.println("thirty-first");
    else
        System.out.println("error");
    if (month == 1 && (day >= 1 && day < 19)||(month == 12&&(day >=1 && day <=21)))
        System.out.print("Horoscope: A very welcome sum of extra money could come your way today, possibly out of the blue.");
    else if ((month == 1 && (day <= 31 && day >= 20)|| (month == 2 && (day >= 1 && day <= 18))))
        System.out.println("Horoscope: Today you may feel especially warm and loving toward just about everybody in your circle, Aquarius, even those you usually find irritating.");
    else if ((month == 2 && (day > 18 && day <= 31))||(month == 3 && (day >=1 && day <=19)))
        System.out.println("Horoscope: Someone you care about but haven't seen for a long time could suddenly contact you.");
    else if ((month == 4&&(day <19 && day >=1))||(month == 3 && (day > 21 && day <= 31)))
        System.out.println("Horoscope: A goal that you've been working on could finally be reached, Aries.");
    else if ((month == 4&&(day <=31 && day >=19))|| (month == 5&&(day >=1 && day <=20)))
        System.out.println("Horoscope: Today you could meet some interesting new people, Taurus.");
    else if (month == 5 &&(day > 20 && day <= 31)||(month == 6&&(day >=1 && day <=20)))
        System.out.println( "Horoscope: A book or movie about a foreign country could capture your imagination and make that country seem especially appealing, Gemini.");
    else if (month == 6&&(day > 20 && day <= 31)||(month == 7&&(day >=1 && day <=20)))
        System.out.println( "Horoscope: Someone close who owes you money might suddenly turn up and repay you, Cancer. ");
    else if (month == 7&(day > 20 && day <= 31)||(month == 8&&(day >=1 && day <=22)))
        System.out.println( "Horoscope: Today you should feel especially warm and loving toward everyone close to you, Leo, particularly a love partner.");
    else if (month == 8&&(day > 22 && day <= 31)||(month == 9&&(day >=1 && day <=22)))
        System.out.println( "Horoscope: You should be looking especially attractive today and glowing with robust health, Virgo. ");
    else if (month == 9&&(day > 22 && day <= 31)||(month == 10&&(day >=1 && day <=22)))
        System.out.println( "Horoscope: Today you should be feeling especially warm and loving toward close friends and children, Libra. ");
    else if (month == 10&&(day > 22 && day <= 31)||(month == 11&&(day >=1 && day <=21)))
            System.out.println( "Horoscope: Today you might decide to buy a plant for every room in your house or plant a garden, Scorpio.");
    else if (month == 11&&(day > 21 && day <= 31))
            System.out.println( "Horoscope: A warm and loving communication could come to you today from someone close.");
    else if (month == 12&&(day >=1 && day <=21))
        System.out.println("Horoscope: A warm and loving communication could come to you today from someone close.");

Lesson_17_Activity_One
        System.out.println("Please enter test scores (enter -1 to stop):");
    double count = -1;
    double average = 1;
    double input = 0;
    while (input != (-1)){
        input = scan.nextDouble();
        count++;
        average = (average + input);}
        System.out.println(average/count);
Lesson_17_Activity_Two
System.out.println("Please enter two numbers");
int e = scan.nextInt();
int x = scan.nextInt();

    while (e <= x){
        {if (e % 2 == 0) {
        System.out.print(e + " ");
        e += 2;}

        if (e % 2 == 1) {
            e++;
            System.out.print(e + " ");
            e += 2;
        }
    }
}*/


import com.sun.deploy.config.Config;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double lon = 0;
        double lat = 0;
        double maxlat = -90;
        double maxlon = -180;
        double minlat = 90;
        double minlon = 180;
        int input = 1;
        while (input ==1){
            System.out.println("Please enter the latitude:");
            lat = scan.nextDouble();
            System.out.println("Please enter the longitude");
            lon = scan.nextDouble();
            if ((lat < -90 || lat > 90)||(lon <-180 || lon >180)){
                System.out.println("Incorrect Latitude or Longitude");}
            else{
                System.out.println("Would you like to enter another location?");
            input = scan.nextInt();
                if (lat > maxlat)
                maxlat = lat;
                if (lon > maxlon)
                maxlon = lon;
                if (lon < minlon)
                minlon = lon;
                if (lat < minlat)
                minlat = lat;}
        }
        System.out.println("Farthest North: " + maxlat);
        System.out.println("Farthest South: " + minlat);
        System.out.println("Farthest East: " + maxlon);
        System.out.println("Farthest West: " + minlon);
    }
}