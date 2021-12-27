package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    int a,b,sum=0;
    a = sc.nextInt();
    b = sc.nextInt();
    for(int i=0;i<b;i++){
        sum = sum -(-a);
    }
        System.out.println("The product of "+a+" and "+b+" is "+sum);
    }
}
// the negative sign will make the subtraction operation to addition: