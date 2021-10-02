package com.company;

import java.util.Scanner;
import java.lang.Math;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =sc.nextInt();
        if(isPalindrome(num)==true){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
    static boolean isPalindrome(int num) {

        int temp = num, temp1, sum = 0, i = 0;
        while (temp > 0) {
            temp1 = temp % 10;
            sum +=(temp1 * (Math.pow(10,i)));
            System.out.println(sum);
            temp = temp / 10;
            i++;
        }
        System.out.println(sum);

        return sum == num;
    }
}
