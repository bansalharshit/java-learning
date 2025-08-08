package com.uiv;

import java.io.BufferedReader;
import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Your Name");
            String name = sc.nextLine();
            RegistrationValidator.validateName(name);

            System.out.println("Enter Your Email");
            String email = sc.nextLine();
            RegistrationValidator.validateEmail(email);

            System.out.println("Enter Your Date of Birth (dd-MM-yyyy): ");
            String dob = sc.nextLine();
            RegistrationValidator.validateDOB(dob);

            System.out.println("\n  Registration Successful!");
        }catch(MissingFieldException | InvalidEmailException | AgeRestrictionException e)
        {
            System.err.println("Error :"+ e.getMessage());
        }finally {
            sc.close();
            System.out.println("\n[INFO]Program Ended.");
        }
    }
}
