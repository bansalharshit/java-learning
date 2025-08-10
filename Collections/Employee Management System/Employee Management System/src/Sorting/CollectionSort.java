package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort{
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}