package com.groupqa1;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(findUniqueSymbols(str));
        System.out.println(toBinary(8));
    }

    public static String findUniqueSymbols(String str) {
        String uniqueSymbols = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!str.replaceFirst(String.valueOf(c), "").contains(String.valueOf(c))) {
                uniqueSymbols += c;
            }
        }
        return uniqueSymbols;
    }

    public static String toBinary(int num) {
        String binary = "";
        while(num > 0){
            binary = num%2 + binary;
            num /= 2;
        }
        return binary;
    }
}