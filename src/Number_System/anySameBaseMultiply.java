package Number_System;

import java.util.Scanner;

public class anySameBaseMultiply extends any_same_base_addition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. n : ");
        int n = sc.nextInt();
        System.out.println("enter no. m : ");
        int m = sc.nextInt();
        System.out.println("enter base: ");
        int b = sc.nextInt();

        System.out.println(multiplySameBase(n, m , b));
    }
    public static int multiplySameBase(int n1,int n2,int b){
        int rv =0, p=1;
        while(n2 > 0){
            int d2 = n2 % 10;
            n2 /= 10;
            int sprd = multiplySingleDigitSameBase(n1, d2, b);
            rv = additionOfAnyBase(rv, sprd * p, b);
            p = p * 10;
        }
        return rv ;
    }
    public static int multiplySingleDigitSameBase(int n1, int d2 , int b){
        int rv = 0, p =1,c=0;
        while(n1 > 0 || c > 0 ){
            int d1 = n1 %10;
            n1 /= 10;

            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;

            rv = rv + d * p;
            p = p *10;
        }
        return rv;
    }

}
