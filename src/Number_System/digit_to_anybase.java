package Number_System;

import java.util.Scanner;

public class digit_to_anybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        int n = sc.nextInt();
        System.out.println("enter base : ");
        int m = sc.nextInt();
        d_to_anyb(n, m);

    }
    public static void d_to_anyb(int n, int m){
        int rn = 0;
        int p =1;
        while (n > 0 ){
            int dig = n % m;
            n = n/m;

            rn += dig * (p);
            p = p *10;
        }
        System.out.println(rn);
    }

}
