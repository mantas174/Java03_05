package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;
    private static int suma = 0;
    private static int[] sk;

    public static void main(String[] args) {
        // write your code here
        Main obj = new Main();
        obj.skaiciuIvedimas();
        obj.rezultatas();

    }
    public void skaiciuIvedimas(){
        System.out.println("Iveskite 5 skaicius");
        Scanner in = new Scanner(System.in);
        sk = new int[5];
        for (int i = 0; i < sk.length; i++){
            System.out.println("Iveskite skaiciu nr. " + (i + 1 ) );
            sk[i] = in.nextInt();
            suma = suma + sk[i];
        }
    }
    public void rezultatas(){
        for (int i = 0; i < sk.length; i++){
            System.out.println(sk[i]);
        }
        System.out.print("suma : " + suma);
    }
}
