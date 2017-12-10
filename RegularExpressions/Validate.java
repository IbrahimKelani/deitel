package com.deitel.RegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Todo         - Fig. 14.21: Input and Validate data from user using the ValidateInput class
 * <@classname> - Validate.java
 * <@author>    - cdi310
 * <@date>      - 01/08/2017
 * <@time>      - 14:38
 */

public class Validate {
    public static void main(String[] args) throws IOException {
        // get user input
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // get first name from the user
<<<<<<< HEAD
        System.out.println("Please enter first name, you may want to isolate things:");
=======
        System.out.println("Please enter first name, you may want to isolate:");
>>>>>>> 75bdb251aec6add8df8094843cb2088783699a24
        String firstName = bufferedReader.readLine();

        // get last name from the user
        System.out.println("Please enter last name:");
        String lastName = bufferedReader.readLine();

        // get address from the user
        System.out.println("Please enter address:");
        String address = bufferedReader.readLine();

        // get city from the user
        System.out.println("Please enter city:");
        String city = bufferedReader.readLine();

        // get state from the user
        System.out.println("Please enter state:");
        String state = bufferedReader.readLine();

        // get zip from the user
        System.out.println("Please enter zip:");
        String zip = bufferedReader.readLine();

        // get phone from the user
        System.out.println("Please enter phone:");
        String phone = bufferedReader.readLine();

        bufferedReader.close();
        inputStreamReader.close();

        // validate user input and display error message
        System.out.println("%nValidate Result:");

        if (!ValidateInput.validateFirstName(firstName)) {
            System.out.println("Invalid first name");
        } else if (!ValidateInput.validatelastName(lastName)) {
            System.out.println("Invalid last name");
        } else if (!ValidateInput.validateAddress(address)) {
            System.out.println("Invalid address");
        } else if (!ValidateInput.validateCity(city)) {
            System.out.println("Invalid city");
        } else if (!ValidateInput.validatePhone(phone)) {
            System.out.println("Invalid phone");
        } else if (!ValidateInput.validateZip(zip)) {
            System.out.println("Invalid zip");
        } else if (!ValidateInput.validateState(state)) {
            System.out.println("Invalid state");
        } else {
            System.out.println("Valid input. Thank you.");
        }
    }
} // end class Validate
