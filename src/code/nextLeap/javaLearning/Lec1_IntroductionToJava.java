package code.nextLeap.javaLearning;
/*
Math Book
- Formula/ Technique/ Concept
- Examples (5-10)
- Exercise Questions (Homework - Practice)

English with some set of rules

Computer - 010101110101(binary)


Java Program (English) (.java) -> Compiler -> Java Byte Code (.class)
JVM -> Byte code into machine dependent code

JRE -> JVM + Libraries
JDK -> Compiler + JRE
 */

// Java - English with some set of Rules
// Class is blueprint of the program which tell us about Functionalities of the program
// Object is a key using which Functionalities can be used
// Functionalities - Static & Non-Static

// Static Function - It does not require any object to use it
// Non-static Function - It requires object to use it

// public - public will make it a public property so that it can be used by everyone
// keywords - there are some special words which have a fixed meaning
// static - this word will make functionality as static
// void - (Lecture 7) (Function) (Return type) (Don't return anything)
// String args[] -> (String array) (Lecture 8) (1D Array)

// RULE 1 - Every java program will require a class
// RULE 2 - FileName of the program should be same as class name
// RULE 3 - Every program we write main function
// RULE 4 - Print anything - System.out.println();

// STEP 1 - We will create a class
// STEP 2 - Created a main function

//Document link: https://docs.google.com/document/d/1Fc3-XTqDFjNVavMA6h_JniCMEBRzREa-yPi1rrceBB4/edit
public class Lec1_IntroductionToJava {
    public static void main(String[] args) {//<- main function
        // STEP 3 - Logic is written inside the main function
        System.out.println("Hello!");
        System.out.println(Math.PI);
        System.out.println("2^2 = "+Math.pow(2,2));
    }
}