package com.company;
import java.util.Arrays;
import java.lang.*;
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String numer;
        StringBuilder builder_stringa =new StringBuilder();
        for (int iterator:numbers) {
            builder_stringa.append(iterator);
        }
        numer=builder_stringa.toString();
        System.out.println(numer);
        StringBuilder builder_numeru =new StringBuilder(numer);
        builder_numeru.insert(0,'(');
        builder_numeru.insert(4,')');
        builder_numeru.insert(5,' ');
        builder_numeru.insert(9,'-');
        numer= builder_numeru.toString();
        System.out.println(numer);
        return numer;
    }
}
