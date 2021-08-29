package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String inputString = input.nextLine();
        int length = inputString.length();
        System.out.printf("%s has %d characters." , inputString,length);

    }
}
