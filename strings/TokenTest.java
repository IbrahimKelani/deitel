package com.deitel.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Todo         - Fig. 14.18: {@link java.util.StringTokenizer} object used to tokenize strings
 * <@classname> - TokenTest.java
 * <@author>    - cdi310
 * <@date>      - 01/08/2017
 * <@time>      - 13:34
 */

public class TokenTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // get sentence from user
        System.out.print("Enter a sentence and press enter: ");
        String sentence = bufferedReader.readLine();

        // close and deallocate bufferedReader and inputStreamReader
        bufferedReader.close();
        inputStreamReader.close();

        // process user sentence
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        // Display the tokens
        for (String token: tokens) {
            System.out.println(token);
        }


    }
}
