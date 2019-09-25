package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'H';
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        boolean myTrue = true;
        boolean myFalse = false;

//         STRINGS
//        they are immutable. This means it cant be changed once its been created. When a string is altered,
//        its creating an entirely new string.
        String myString = "Hello World, you scum!";
        System.out.println(myString);

        String sentence = "This is a string";
        System.out.println(sentence); // This is a string
        sentence = sentence + ", and this is more!";
        System.out.println(sentence); // This is a string, and this is more!

        String myNum = "250.44";
        String secNum = "135.88";
        System.out.println(myNum + secNum); // 250.44135.88

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to: "+lastString); // Last String is equal to: 1050


    }
}
