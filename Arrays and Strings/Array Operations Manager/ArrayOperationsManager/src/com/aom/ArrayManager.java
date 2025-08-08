package com.aom;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManager {
    private int[] arr;

    public void createArray(int size, Scanner sc)
    {
        arr = new int[size];
        System.out.println("Enter "+ size + " integers");
        for(int i =0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void dispalyArray(){
        System.out.println("Array "+ Arrays.toString(arr));
    }

    public void searchElement(int element)
    {
        for(int i =0;i<arr.length;i++)
        {
             if(arr[i] == element)
             {
                 System.out.println("Element Found at index "+ i);
                 return;
             }
        }
        System.out.println("Element not found.");
    }

    public void findLargest()
    {
        int max = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number "+max);
    }

    public void findMinimum()
    {
        int min = arr[0];
        for(int ele:arr)
        {
            if(ele<arr[0])
                min = ele;
        }
        System.out.println("Minimum Number "+min);
    }

    public void sortArray(boolean ascending)
    {
        Arrays.sort(arr);
        if(!ascending)
        {
            for(int i =0;i<arr.length/2;i++)
            {
                int temp = arr[i];
                arr[i] = arr[arr.length -1-i];
                arr[arr.length-1-i] = temp;
            }
        }
        System.out.println("Sorted Array "+Arrays.toString(arr));
    }
}
