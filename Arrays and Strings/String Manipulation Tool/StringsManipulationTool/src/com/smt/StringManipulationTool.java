package com.smt;

import java.util.Scanner;

public class StringManipulationTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = " ";
        while(true)
        {
            System.out.println("Enter the Sentence :");
            string = scanner.nextLine();

            // input validation
            if(string == null || string.trim().isEmpty())
                System.out.println("Error: Sentece can not be null or Empty. Try Again");
            else
                break;
        }

        boolean running = true;
        while(running)
        {
            System.out.println("Choose the Options Below");
            System.out.println("\n1. Find Length ");
            System.out.println("\n2. Extract Substring ");
            System.out.println("\n3. Search For Character ");
            System.out.println("\n4. Replace World ");
            System.out.println("\n5. Exit ");
            System.out.println();
            System.out.println("Enter Your Choice ");
            int choice;

            try
            {
                 choice = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e) {
                System.out.println("Invalid Input. Enter the Number between 1 to 5");
                continue;
            }

            switch(choice)
            {
                case 1:
                    System.out.println("Lenght of Given String "+string.length());
                    break;
                case 2:
                    try{
                        System.out.println("Enter Your start Index");
                        int start = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter End Index");
                        int end = Integer.parseInt(scanner.nextLine());
                        System.out.println("Substring :" + string.substring(start,end));
                    }catch(StringIndexOutOfBoundsException | NumberFormatException e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter the Character to Search");
                    char ch = scanner.nextLine().charAt(0);
                    int index = string.indexOf(ch);
                    if(index!=-1)
                        System.out.println("Character Found at index "+index);
                    else System.out.println("character not found");
                    break;
                case 4:
                    System.out.println("Enter the Word To Replace from String");
                    String word = scanner.nextLine();
                    if(!string.contains(word))
                    {
                        System.out.println("Error: The Word "+word+ " is not found in the sentence.");
                        break;
                    }
                    System.out.println("Enter Your New Word ");
                    String newWord = scanner.nextLine();

                    String updateSentece = string.replace(word,newWord);
                    System.out.println("updated sentece :"+updateSentece);
                    string = updateSentece;
                    break;
                case 5:
                    running = false;
                    System.out.println("Thanks for Using the Application");
                    break;
                default:
                    System.out.println("Invalid Choice, Please Select between 1 to 5 ");
            }

        }
        scanner.close();
    }
}
