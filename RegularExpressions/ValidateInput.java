package com.deitel.RegularExpressions;

/**
 * Todo         - Fig. 14.20: Validate user information using regular expressions.
 * <@classname> - ValidateInput.java
 * <@author>    - cdi310
 * <@date>      - 01/08/2017
 * <@time>      - 14:03
 */

public class ValidateInput {
    // validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][A-Za-z]*");
    }

    // validate last name
    public static boolean validatelastName(String lastName) {
        return lastName.matches("[A-Za-z]+(['-][A-Za-z]+)*");
    }

    // validate address
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([A-Za-z]+|[A-Za-z]+\\s[a-zA-Z]+)");
    }

    // validate city
    public static boolean validateCity(String city) {
        return city.matches("([A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+)");
    }

    // validate state
    public static boolean validateState(String state) {
        return state.matches("([A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+)");
    }

    // validate zip
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }

    // validate phone
    public static boolean validatePhone(String phone) {
        return phone.matches("([1-9]\\d{2}-[1-9]\\d{2}-\\d{4})");
    }
} // end class ValidateInput