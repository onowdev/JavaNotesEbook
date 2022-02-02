package com.ags.hcrank;

import java.util.Scanner;
public class InputLuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Panjang Persegi nya : ");
        int lebar = input.nextInt();

        int luas = lebar * lebar;

        System.out.println("Luas Persegi adalah: " + luas);

        input.close();
    }
}
