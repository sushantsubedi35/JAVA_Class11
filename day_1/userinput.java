package day_1;

import java.util.Scanner;

public class userinput{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int number = scanner.nextInt();           
        System.out.println(number);              
        scanner.close();                         
    }
}
