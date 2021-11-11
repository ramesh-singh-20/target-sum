package com.alphacoder.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {

    public static List<Integer> returnIndicesWithTwoForLoops(int [] arr, int target){
        List<Integer> indices= new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    indices.add(i);
                    indices.add(j);
                    break;
                }
            }
        }

        if(indices.isEmpty()){
            throw new RuntimeException("Target sum does not exists.");
        }

        return indices;
    }

    public static List<Integer> returnIndicesWithSorting(int [] arr, int target){
        List<Integer> indices= new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0, j= arr.length-1; i<=(i+j)/2 && j>=(i+j)/2;){
            if(arr[i]+arr[j]== target){
                indices.add(i);
                indices.add(j);
                break;
            }
            else if(arr[i]+arr[j]< target){
                i++;
            }
            else if(arr[i]+arr[j]> target){
                j--;
            }
        }

        if(indices.isEmpty()){
            throw new RuntimeException("Target sum does not exists.");
        }

        return indices;
    }
}
