package javaforselenium;

public class demo {
    public static void main(String[] args) {
        String input = "a1b2c3";
        separateDigitsAndAlphabets(input);
    }
     
    public static void separateDigitsAndAlphabets(String str) {
        String number = "";
        String letter = "";
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (Character.isDigit(a)) {
                number = number + a;
         
            } else {
                letter = letter + a;
             
            }
        }
       System.out.println(letter+number);
     
    }
} 
