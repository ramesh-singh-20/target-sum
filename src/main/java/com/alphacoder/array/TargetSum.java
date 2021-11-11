package com.alphacoder.array;

import java.util.*;

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

    public static int[] returnIndicesWithSorting(int [] num, int target){
        int[] indices= new int[2];

        int[] numCopy= Arrays.copyOf(num, num.length);
        int[] sortedIndices= new int[2];
        Arrays.sort(numCopy);

            for(int i=0, j= numCopy.length-1; i<j;){
                if(numCopy[i]+numCopy[j]== target){
                    sortedIndices[0]= i;
                    sortedIndices[1]= j;
                    break;
                }
                else if(numCopy[i]+numCopy[j]< target){
                    i++;
                }
                else if(numCopy[i]+numCopy[j]> target){
                    j--;
                }
            }

            for(int i=0; i< num.length; i++){
                if(numCopy[sortedIndices[0]]== num[i]){
                    indices[0]= i;
                    break;
                }
            }

        for(int i=num.length; i>= 0; i--){
            if(numCopy[sortedIndices[1]]== num[i]){
                indices[1]= i;
                break;
            }
        }

        return indices;
    }

    public static int[] returnIndicesWithHashMap(int [] nums, int target){
        int[] indices= new int[2];

        Map<Integer, Integer> indicesMap= new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(indicesMap.containsKey(nums[i])){
                indices[0]= i;
                indices[1]= indicesMap.get(nums[i]);
            }else{
                indicesMap.put((target-nums[i]), i);
            }
        }

        return indices;
    }
}
