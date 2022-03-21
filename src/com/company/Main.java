package com.company;

public class Main {

    //Variable Declaration
    private static int number;

    //Global variables. This are variables declared within a class.
    int myGlobal = 12;

    /**
    * */
    public static void main(String[] args) {
        // Comments

        //This is a comment and java wouldn't read it while compiling
        //We call this type of comment one line comment because they affect  one line  of code.
        System.out.println("This is printed after the first 3 comments, adn java didn't read any of them.");

        /*your comment goes  here */
        /*
         * This is another type of comment
         *
         * it is called a multiline comment because it affects more  than one line
         **/

        /** you comment goes here */

        /**
         * this is a documentation comment
         *
         * it is used to define a member: class, method etc.
         * */

        //Calling variables method
        variables();

       // Calling  assignment Operators method
        assignmentOperators();
    }

        //New methode to contain code on variables
        static void variables () {
        //variable

        String glassCup= "Wine";
        int numOfStudents = 20;

        System.out.println(glassCup);
        System.out.println("number of students in the class:" + numOfStudents);

        //Variable initalization
        number = 5;

        //Local variable. This is a variable declared in a method.
        int myLocalVariable = 30;

        //Block. code that is within a starting and closing curly brace {}.
        {
            //Local variable declared within a nested block- it is visible only within such block
            int a = 1;
            a = 50;
            System.out.println("the value of a is: " + a);
        }

        {
            int i = 0;
            //the variable 'i' only visible inside the block.
        }
        //System.out.println(i);

        //Final variable. a variable that cannot be changed.
        final int finalVariable = 25;
    }

    //Code for data types
    static void dataTypes() {
        //Numeric data types

        //byte -128 to 127
        byte myByteNumber = 127;

        //Short -32768 to 32767
        short myShortNumber = -22556;

        //int  from -2147483648 to 2147483647.
        int myIntNumber = 1230000;

        //Long from -2^63 to (2^63)-1 - this is really a lot :) suffix with l
        long myLongNumber = 254555455672L;

        //Float. Number that has from 6-7 decimal places suffix with f
        float  myFloatNumber = 12.0005f;

        //double.has a maximum of 15 decimal places. suffix with d
        double myDoubleNumber = 12.000000005d;

        //boolean type. has only true or false as the values
        boolean myFalseValue = false;
        boolean myTrueValue = true;

        //Character data type. is saved in a single quote.
        char singleA = 'a';
        char tab = '\t';

        //Strings. used to store a sequence of characters (text) is saved in a double quote
        String someText = "This is a simple text";
    }

    static void assignmentOperators() {

        // = this operator is used to assign a value to the specified variable.
        int intValue = 5;

        // += this operator is used to add specified value to existing variable
        int a = 50;
        a += 50;

        System.out.println("the value of a is:" + a);

        // -= this operator is used to subtract specified value from existing variable
        int b = 40;
        b -= 20;

        //sout: shortcut for System.out.println();
        System.out.println("the value for b is :" + b);

        // *= this operator multiplies the specific value with the existing variable

        int c = 10;
        c *= 4;

        System.out.println("the value of c is: " + c);

        //  /= this operator divides the specified value from the existing variable

        int d = 40;
        d /= 4;

        System.out.println("the value of d is:" + d);
    }
}
