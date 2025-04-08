public class Lesson2_DataType {
    public static void main(String [] args){
        System.out.println("This is Lesson - 2 (Variable)");
       // Add Three Numbers
        int num1 = 1, num2 = 3, num3 = 6;
        int sum = num1+num2+num3;
        System.out.println("The sum of Three Number is : " + sum);
    }
}

/*
 * Anatomy of A Java Program
 * 1. Documentation Section - SUggested
 * 2. Package Statments - Optional
 * 3. Import Statement - Optional
 * 4. Interface Statement - Optional
 * 5. Class Definitions - Optional
 * 6. Main Method Class
 * {
 *   Main Method Definition - Necessory
 * }
 * 7. Java Language is staticaly typed language which require
 * type data type to define variable
 * */

/*
 * Data Type in Java
 * 1. Primitive Data Type
 * byte - 1byte(8bit) -  -2^7/2 to 2^7/2 - 1 (-128 to 127)
 * Default value 0
 * int - 4byte(32bit) - -2^32/2 to 2^32/2 - 1
 * Default value 0
 * float - 4byte(32bit) - -2^32/2 to 2^32/2 - 1
 * Default value 0.0f
 * long - 8byte(64bit) - -2^64/2 to 2^64/2 - 1
 * double - 8byte(64bit) - -2^64/2 to 2^64/2 - 1
 * Default value 0.0d
 * char - 2byte - it support unicode - 0 to 65535(2^16-1)
 * short - 2byte(16bit) - -2^16/2 to 2^16/2 - 1
 * bool - true or false - size depends on JVM
 * Default value false
 *
 * 2. Non-Primitive Data Type
 * -- Derived from Primitive data type
 *
 * */
