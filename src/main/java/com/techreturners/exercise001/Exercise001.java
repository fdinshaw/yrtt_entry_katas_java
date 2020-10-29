package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
        // Add your code here!
        
        Map occurs =new HashMap();

For(int i=0;i<are.length;i++) {

  Integer count=occurs.get(arr[i]);

  if(count==null) 

    Occurs.put(arr[i], 1);

  else if(count>0) 

     Occurs.put(arr[i], count+1);

}

Int sum=0;

for(Integer key : occurs.keySet()) {

  if(occurs.get(key)==1)

    Sum=sum+occurs.get(key);

}

Return sum;


        return 0;
    }
}
