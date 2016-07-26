package com.leetcode;

/**
 * Created by qiudeyang on 15/06/16.
 */
import java.util.*;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
//        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//        List<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0){
            return false;
        }
        Hashtable table = new Hashtable();
        for (int i = 0; i < nums.length; i++) {
            if(table.containsKey(nums[i])){
                table.put(nums[i],(int)table.get(nums[i])+1);
            }else {
                table.put(nums[i],1);
            }
        }
        Iterator itr = table.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            if((int)entry.getValue() > 1){
                return true;
            }
        }
        return false;
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            list.add(entry.getValue());
//        }
//        if(Collections.max(list) > 1){
//            return true;
//        }else{
//            return false;
//        }

    }
}
public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution217  solution217 = new Solution217();
        int[] nums = {1,2,4,3,5};
        System.out.println(solution217.containsDuplicate(nums));
    }
}
