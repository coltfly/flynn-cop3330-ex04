package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App 
{
    public static void main( String[] args )
    {
        String story = "Do you {verb} your {adjective} {noun} {adverb}? That's hilarious!";
        Scanner Obj = new Scanner(System.in);
        System.out.print( "Enter a noun: ");
        String noun = Obj.nextLine();
        System.out.print( "Enter a verb: ");
        String verb = Obj.nextLine();
        System.out.print( "Enter an adjective: ");
        String adjective = Obj.nextLine();
        System.out.print( "Enter an adverb: ");
        String adverb = Obj.nextLine();
        System.out.println(story.replace("{verb}", verb).replace("{noun}", noun).replace("{adjective}", adjective).replace("{adverb}", adverb));
    }
}
