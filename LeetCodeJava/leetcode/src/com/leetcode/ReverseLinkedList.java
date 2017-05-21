package leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
    	List<Character>  list = new LinkedList<Character>();
    	list.add('a');
    	list.add('e');
    	list.add('i');
    	list.add('o');
    	list.add('u');
    	list.add('A');
    	list.add('E');
    	list.add('I');
    	list.add('O');
    	list.add('U');
    	
    	char[] array = s.toCharArray();
    	int head = 0;
    	int tail = array.length - 1;
    	while(head < tail){
    		if(!list.contains(array[head])){
    			head++;
    			continue;
    		}
    		if(!list.contains(array[tail])){
    			tail--;
    			continue;
    		}
    		char temp = array[head];
    		array[head] = array[tail];
    		array[tail] = temp;
    		head++;
    		tail--;
    	}
    	return new String(array);
        
    }
}
public class ReverseLinkedList {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverseVowels("hello"));
	}

}
