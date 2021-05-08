package com.company.utils;

public class StringUtils {

    public static String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase()
                .concat(word.substring(1));
    }
}
