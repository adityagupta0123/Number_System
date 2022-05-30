package Number_System;

import java.util.Scanner;


public class any_base_to_any_base extends  any_base_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. : ");
        int n = sc.nextInt();
        System.out.println("enter b1: ");
        int b1 = sc.nextInt();
        System.out.println("enter b2: ");
        int b2 = sc.nextInt();

        int dec =  any_base_digit(n, b1);
        int dn = digit_to_anybase(dec, b2);

        System.out.println(dn);
    }
    static int any_base_digit(int n, int m){
        int rn = 0;
        int p =1;
        while (n > 0 ){
            int dig = n % 10;
            n = n/10;

            rn += dig * (p);
            p = p * m;
        }
        return rn;
    }
    static int digit_to_anybase(int n, int m){
        int rn = 0;
        int p =1;
        while (n > 0 ){
            int dig = n % m;
            n = n/m;

            rn += dig * (p);
            p = p *10;
        }
        return rn;
    }

}
