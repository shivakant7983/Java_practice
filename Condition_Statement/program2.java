package Condition_Statement;

import java.util.Scanner;


/*
Question : Day shift
 */
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();

        if(hour >=5 && hour <= 11){
            System.out.println("Good Morning");
        }
        else if(hour >= 12 && hour <=16){
            System.out.println("Good Afternoon");
        }
        else if(hour >=17 && hour <=20){
            System.out.println("Good Evening");
        }
        else if(hour >=21 && hour <=24 || hour >=0 && hour <=4){
            System.out.println("Good Night");
        }
        else {
            System.out.println("Invalid Hour");
        }
    }
}
