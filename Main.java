package com.company;
/*
5) Дано целое число N (1 ≤ N ≤ 26). Вывести N последних строчных
(т. е. маленьких) букв латинского алфавита в
обратном порядке (начиная с буквы «z»).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alphabet = "zyxwvutsrqponmlkjihgfedcba";
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String alphabet2 = alphabet.substring(0 , N);
        System.out.println(alphabet2);


    }
}
/*
28) Дан символ C и строка S. Удвоить каждое вхождение символа C в строку S.
 */
class lab2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Writte symbol and string:");
        String symbol = reader.readLine();
        String string = reader.readLine();
        String newString =  string.replace(symbol, symbol+symbol);
        System.out.print("Conclusion: ");
        System.out.println(newString);



    }

}
/*
51) Дана строка, состоящая из слов кириллицей, набранных заглавными буквами и разделенных пробелами (одним или несколькими).
Вывести строку, содержащую эти же слова, разделенные одним пробелом и расположенные в алфавитном порядке.
 */
class LAB3 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Writte string:");
        String string = reader.readLine();
        String upstring = string.toLowerCase();
        String[] words = upstring.split(" ");
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++){

                System.out.print(words[i]+" ");

        }

    }
}