package com.deitel.strings;

/**
 * <@Todo>       - Fig. 14.1 {@link StringConstructors.java}
 * <@className> - StringConstructors.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/31/17
 * <@time>      - 9:08 PM
 */
public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

        // use String constrcutors
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
    }
} // end class StringConstructors
