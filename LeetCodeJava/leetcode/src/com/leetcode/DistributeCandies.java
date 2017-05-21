package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qiudeyang on 17/05/17.
 */
class Solution575 {
    public int distributeCandies(int[] candies) {
        if(candies == null || candies.length < 2){
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int candy:candies){
            set.add(candy);
        }
        if(set.size()>candies.length/2){
            return candies.length/2;
        }
        return set.size();
    }
}
public class DistributeCandies {
    public static void main(String[] args) {
        Solution575 solution575 = new Solution575();
        int[] candies = {1,1,2,3};
        System.out.println(solution575.distributeCandies(candies));
    }
}
