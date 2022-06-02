package Number_System;

import java.util.Scanner;

public class any_sameBase_subtration {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("m always greater ");
            System.out.println("enter no. n : ");
            int n = sc.nextInt();
            System.out.println("enter no. m : ");
            int m = sc.nextInt();
            System.out.println("enter base: ");
            int b = sc.nextInt();
            int sub = 0;
            int p = 1;
            while (Math.max(n, m) > 0) {
                int temp1 = n % 10;
                int temp2 = m % 10;
                n /= 10;
                m /= 10;
                if ((temp1 > temp2) ) {
                    sub += ((temp2 + b) - temp1) * p;
                    m--;
                } else {
                    sub += (temp2  - temp1) * p;
                }
                p = p * 10;

            }
            System.out.println(sub);
        }
}
