package com.ags.hcrank;

import java.util.*;
public class IfElseJava {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N%2!=0){
            System.out.println("weird");
        }
        else if(N >=2 && N<5){
            System.out.println("not Weird");
        }
        else if(N>= 6 && N <= 20){
            System.out.println("weird");
        }
        else if(N>20){
            System.out.println("Not Weird");
        }
        Scanner.close();
    }
}
