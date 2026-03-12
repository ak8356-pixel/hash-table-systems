package hashtablesystems;

import java.util.*;

public class Q9_TwoSumTransactions {

    public static void twoSum(int[] nums,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                System.out.println("Pair: "+nums[i]+" "+complement);
                return;
            }

            map.put(nums[i],i);
        }
    }

    public static void main(String[] args){

        int[] arr = {500,300,200};

        twoSum(arr,500);
    }
}
