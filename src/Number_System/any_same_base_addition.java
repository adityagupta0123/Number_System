package Number_System;

import java.util.Scanner;

public class any_same_base_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. : ");
        int n = sc.nextInt();
        System.out.println("enter no. : ");
        int m = sc.nextInt();
        System.out.println("enter base: ");
        int b = sc.nextInt();
        int sum = 0;
        int p =1;
        while(Math.max(n,m) > 0){
            int temp1 = n %10;
            int temp2 = m % 10;
            n /= 10;
            m /= 10;
            if((temp1 + temp2) > b ){
                sum +=  ((temp1 + temp2)%b ) * p ;
                n++;
            }else {
                sum += (temp1 + temp2) * p;
            }
            p = p * 10;

        }
        System.out.println(sum);
    }
}
