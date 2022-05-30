package Number_System;

import java.util.Scanner;

public class any_base_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. : ");
        int n = sc.nextInt();
        System.out.println("enter b1: ");
        int b1 = sc.nextInt();
        System.out.println("enter b2: ");
        int b2 = sc.nextInt();
        int rv=0;
        int p =1;
        while (n > 0){
            int dig = n % b2;
            n = n /b2;

            rv += dig * p;
            p = p * b1;

        }
        System.out.println(rv);
    }
}
