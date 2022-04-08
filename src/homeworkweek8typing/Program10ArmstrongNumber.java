package homeworkweek8typing;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Program10ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int a = scanner.nextInt();
        isArmstrongNumber(a);
        scanner.close();
    }

    public static void isArmstrongNumber(int num) {
        int number, temp, total = 0;
        number = num;
        while (num != 0) {
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;
        }
        if (total == number) {
            System.out.println(number + " Is an Armstrong Number");
        } else {
            System.out.println(number + " Is not an Armstrong Number");
        }
    }

}

