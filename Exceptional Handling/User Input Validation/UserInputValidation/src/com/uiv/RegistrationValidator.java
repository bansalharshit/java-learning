package com.uiv;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class RegistrationValidator {
    public static void validateName(String name) throws MissingFieldException
    {
        if(name == null || name.trim().isEmpty())
        {
            throw new MissingFieldException("Name is required");
        }
    }

    public static void validateEmail(String email) throws MissingFieldException,InvalidEmailException
    {
        if(email==null || email.trim().isEmpty())
            throw new MissingFieldException("Email is required");

        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$";
        if(email.matches(emailRegex)){
            throw new InvalidEmailException("Invalid Email Formate");
        }
    }

   public static void validateDOB(String dob) throws AgeRestrictionException,MissingFieldException
   {
       if(dob == null || dob.trim().isEmpty())
           throw new MissingFieldException("Date of birth is required.");

       try{
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
           LocalDate birthDate = LocalDate.parse(dob,dtf);
           int age = Period.between(birthDate,LocalDate.now()).getYears();
           if(age<18)
               throw new AgeRestrictionException("You must be at least 18 years of old to register.");
       }catch(DateTimeParseException e)
       {
           throw new MissingFieldException("Invalid date formate. please use dd-MM-yyyy");
       }
   }
}
