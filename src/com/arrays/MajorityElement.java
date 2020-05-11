package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mapp = new HashMap<>();
        int valueLookingFor = 0;
        int keyLookingFor = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!mapp.isEmpty()){
                if(mapp.containsKey(nums[i])){
                    int value = mapp.get(nums[i]);
                    mapp.put(nums[i], value+1);
                }else {
                    mapp.put(nums[i], 1);
                }
            }else {
                mapp.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : mapp.entrySet()){
            for (Map.Entry<Integer, Integer> ee : mapp.entrySet()) {
                System.out.println("Item : " + ee.getKey() + " Count : " + ee.getValue());
            }
        }
        for(Map.Entry<Integer, Integer> entry : mapp.entrySet()){
            if(entry.getValue() >= valueLookingFor){
                valueLookingFor = entry.getValue();
                keyLookingFor = entry.getKey();
            }
        }

        return keyLookingFor;
    }

    public static void main(String[] args) {
        /*int[] num1 = {6,5,5};
        int[] num2 = {2,2,1,1,1,2,2};
        int[] num3 = {3,2,3};*/
        int[] num4= {-1,1,1,1,2,1};

        /*System.out.println(majorityElement(num1));
        System.out.println(majorityElement(num2));
        System.out.println(majorityElement(num3));*/
        System.out.println(majorityElement(num4));
    }
}
