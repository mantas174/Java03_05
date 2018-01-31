package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;
    public static void main(String[] args) {
        // write your code here
        Main obj = new Main();

    }

    public Main() {

        int suma = 0;
        int[] sk = new int[5];

        for(int i = 0; i < sk.length; i++){
            sk[i] = duokGarantuotaiSkaiciu();
            suma += sk[i];
        }
        for(int i = 0; i < sk.length; i++) {
            System.out.println((i + 1) + " skaicius " + sk[i]);

        }
        System.out.print("suma : " + suma);
    }

    public int duokGarantuotaiSkaiciu() {
        int rezultatas = 0;
        Scanner in = new Scanner(System.in);

        boolean arPavyko = false;
        while(arPavyko == false) {
            try {
                System.out.print("Iveskite skaiciu ");
                rezultatas = in.nextInt();
                arPavyko = true;
            }catch (Exception klaida){
                System.out.println("tekstas yra ne skaicius");
                in.next();
            }
        }

        return rezultatas;

    }
}
