package com.deitel.strings;

/**
 * <@Todo>       - Fig. 14.9: String valueOf methods
 * <@className> - StringValueOf.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/31/17
 * <@time>      - 11:15 PM
 */
public class StringValueOf {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char charactereValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // L suffikx indicates long
        float floatValue = 2.5f; // f indicates float
        double doubleValue = 33.333; // no suffix, double is default
        Object objectRef = "hello"; // assign string to an Object reference

        System.out.printf("char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n", String.valueOf(charArray, 3, 3));
        System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf("char = %s%n", String.valueOf(charactereValue));
        System.out.printf("int = %s%n", String.valueOf(integerValue));
        System.out.printf("long = %s%n", String.valueOf(longValue));
        System.out.printf("float = %s%n", String.valueOf(floatValue));
        System.out.printf("double = %s%n", String.valueOf(doubleValue));
        System.out.printf("Object = %s%n", String.valueOf(objectRef));
    }
} // end cla:ss StringValueOf
