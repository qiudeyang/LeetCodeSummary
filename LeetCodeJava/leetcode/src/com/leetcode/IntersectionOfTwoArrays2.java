package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i < nums1.length;i++){
        	for (int j = 0; j < nums2.length ;j++){
        		if(nums1[i] == nums2[j]){
        			list.add(nums1[i]);
        			j++;
        			System.out.println(i);
        			System.out.println(j);
        		}
        		
        	}
        }
        Integer[] a = list.toArray(new Integer[] {});
        int[] b = new int[a.length];
        for(int i = 0; i< a.length;i++){
        	b[i] = a[i].intValue();
//        	System.out.println(b[i]);
        }
        return b;
    }
}

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(solution.intersection(nums1, nums2));

	}

}
