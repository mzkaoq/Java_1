package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        for (int m = 2; m < Math.sqrt(x); m++) {
            if (x % m == 0) {
                System.out.println(x + " nie pierwsza");
                i++;
                break;
            }
        }
        if(i==0){
            System.out.println(x + " jest pierwsza");
        }
    }
}
