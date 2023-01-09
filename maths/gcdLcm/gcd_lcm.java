package maths.gcdLcm;

import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        findGCD_LCM(a,b);
    }

    private static void findGCD_LCM(int a, int b) {
        int g = gcd(a,b);
        int lcm = (a*b)/g;

        System.out.println("GCD is: "+g);
        System.out.println("LCM is: "+lcm);
    }

    private static int gcd(int a, int b) {
        // Using Euclidean’s theorem
        //base case
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
