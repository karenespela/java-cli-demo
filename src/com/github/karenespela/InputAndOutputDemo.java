package com.github.karenespela;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputAndOutputDemo {

    public static void main(String[] args) throws Exception {
        InputStream stdinStream = System.in;
        InputStreamReader stdinStreamReader = new InputStreamReader(stdinStream);
        BufferedReader stdinReader = new BufferedReader(stdinStreamReader);

        String userInput;
        while((userInput = stdinReader.readLine()) != null) {
            System.out.println(userInput);
        }

        System.out.println("Goodbye!");
    }
}
