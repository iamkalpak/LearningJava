package code.genieAshwani;

public class Lec2_Identifiers {
    public static void main(String[] args) {
        /*
        Identifiers: They are symbolic names used to uniquely identify programming
                     elements such as methods, variables,classes, interfaces and other
                     entities of program. They play a crucial role in making the code
                     more readable, maintainable, and understandable by providing meaningful
                     names to different elements aiding both programmers and compilers in
                     effectively communicating the program's logic and structure

                     OR

                     Identifier is a name assigned to programming elements like variables, methods
                     classes, abstract classes, interfaces
         Rules:
            1. Identifier should not start with any number.
            2. Identifier may be start with alphabet, '_' symbol, '$' symbol
            3. It should not start with special character and should not contain white space

            




        */
        int a=10;
        System.out.println(a);

        int  _a=199;
        System.out.println(_a);

        int $a=45;
        System.out.println($a);

//        int 9sal=10000;<- Error
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,3));// <- 2^3
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);



    }
}
