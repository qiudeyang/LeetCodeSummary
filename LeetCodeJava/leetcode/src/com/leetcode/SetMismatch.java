package com.leetcode;

/**
 * Created by qiudeyang on 2017/7/23.
 */
import java.util.Map;
import java.util.HashMap;

class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        if(nums == null || nums.length < 2){
            return result;
        }
        Map<Integer,Integer> map = new HashMap <Integer,Integer>();
        int[] temp = new int[nums.length];
        for(int i = 0;i < nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0]=nums[i];
            }else{
                map.put(nums[i],1);
                temp[nums[i]-1]=-1;
            }
        }
        for(int i = 0; i < temp.length;i++){
            if(temp[i] != -1){
                result[1]=i+1;
                break;
            }
        }
        return result;
    }
}
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        Solution645 solution645 = new Solution645();
        int[] result = solution645.findErrorNums(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }
    }
}
