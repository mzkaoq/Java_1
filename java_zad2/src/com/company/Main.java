package com.company;

public class Main {

    public static void main(String[] args) {
        String m="czesc mam na imie filip i lubie kolor czerwony";
        int w;
        w = m.length();
       String[] parts= m.split(" ");
       String[] tab1=new String[parts.length];
       for(int i=0;i<parts.length;i++){
           tab1[i]=parts[i];
        }
        for(int i=0;i<parts.length;i++){
            System.out.print(tab1[i] + " ");
        }
        System.out.println("\n"+parts.length);
        String newstring;
        newstring = String.join(" | ",tab1);
        System.out.println(newstring);
        for(int i=0;i<newstring.length();i++){
          if(i%2==0) System.out.print(newstring.charAt(i));
          else System.out.print("*");
        }
    }
}
