package Condition_Statement;


import java.util.Scanner;

/*
    Question -->   largest of 2 number
 */
public class program1 {

    public static void main(String[] args) {
        //Step1 : create two integer variable

        int num1 , num2;

        // step2 : read data using Scanner

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //step3 : is the logic to find largest

        if(num1> num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
