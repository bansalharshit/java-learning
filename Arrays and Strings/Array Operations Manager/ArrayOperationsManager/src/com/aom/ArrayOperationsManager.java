package com.aom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperationsManager {
    public static void main(String[] args) {
        ArrayManager manager = new ArrayManager();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the size of array ");
            int size = sc.nextInt();
            if(size<=0)
                throw new IllegalAccessException("Array size must be positive and atleast 1");
            manager.createArray(size,sc);
            while(true)
            {
                System.out.println("\n------Array Operations------");
                System.out.println("\n1. Display Array");
                System.out.println("\n2. Search Element");
                System.out.println("\n3. Find Largest");
                System.out.println("\n4. Find Smallest");
                System.out.println("\n5. Sort Ascending");
                System.out.println("\n6. Sort Descending");
                System.out.println("\n7. Exit");
                System.out.println();
                System.out.println("Enter Your Choice");
                int choice;
                try{
                    choice = sc.nextInt();

                    switch (choice)
                    {
                        case 1:
                            manager.dispalyArray();
                            break;
                        case 2:
                            System.out.println("Enter the Element to Search");
                            int element = sc.nextInt();
                            manager.searchElement(element);
                            break;
                        case 3:
                            manager.findLargest();
                            break;
                        case 4:
                            manager.findMinimum();
                            break;
                        case 5:
                            manager.sortArray(true);
                            break;
                        case 6:
                            manager.sortArray(false);
                            break;
                        case 7:
                            System.out.println("Thanks for using the program");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                }catch (InputMismatchException e)
                {
                    System.out.println("Invalid Input, Choose Number Between 1 to 7");
                }
            }
        }catch(InputMismatchException e)
        {
            System.out.println("Invalid input! Please Enter Integer Only");
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
