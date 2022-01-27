package com.ags.hcrank;

import java.util.Scanner;
public class Stdio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double d = scan.nextDouble();
        String s=" ";
        while (scan.hasNext()){
            s=scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + a);

    }
}
