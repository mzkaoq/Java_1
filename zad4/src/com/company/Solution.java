package com.company;

import java.util.*;
class Solution{

    static String toCamelCase(String s){
        boolean tak=false;
        String wynik;
        System.out.println(s);
        String str[] = s.split("");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        List<String> result = new ArrayList<>();
        for(String z: al){
            if(String.valueOf(z).equals(String.valueOf('_'))){
                z="";
                tak=true;
                continue;
            }
            if(String.valueOf(z).equals(String.valueOf('-'))){
                z="";
                tak=true;
                continue;
            }
            if(tak==true) {
                z = z.toUpperCase();
                tak =false;
            }
            result.add(z);
        }
        StringBuilder strbul=new StringBuilder();
        for(String h : result)
        {
            strbul.append(h);
        }
        System.out.println(strbul);
        wynik= strbul.toString();
        return wynik;
    }
    }
