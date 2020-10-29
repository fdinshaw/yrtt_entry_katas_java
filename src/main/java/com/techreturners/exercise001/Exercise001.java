package com.techreturners.exercise001;

import java.util.HashMap;
import java.util.Map;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

	public int singles(int [] arr){
		// Add your code here!
		System.out.println("test");
		HashMap<Integer, Integer> occurs =new HashMap<Integer, Integer>();

		for(int i=0;i<arr.length;i++) {
			Integer count=occurs.get(arr[i]);
			if(count==null) 
				occurs.put(arr[i], 1);
			else if(count>0) 
				occurs.put(arr[i], count+1);
		}

		int sum=0;
		for(Integer key : occurs.keySet()) {
			if(occurs.get(key)==1)
				sum=sum+key;
		}

		return sum;

	}
}
