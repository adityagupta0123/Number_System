package Number_System;

import java.util.Scanner;

public class any_base_digit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no. ");
            int n = sc.nextInt();
            System.out.println("enter base : ");
            int m = sc.nextInt();
            int rn = 0;
            int p =1;
            while (n > 0 ){
                int dig = n % 10;
                n = n/10;

                rn += dig * (p);
                p = p * m;
            }
            System.out.println(rn);

        }

}
