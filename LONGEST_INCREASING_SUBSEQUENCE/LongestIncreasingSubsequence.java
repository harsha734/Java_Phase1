package com.simplilearn.seq;
public class LongestIncreasingSubsequence{
	
   static int Longest_Increasing_Subsequence(int arr[], int arr_len){
	   //New Array Created Which is Empty
      int seq_arr[] = new int[arr_len];
      //max assigned to 0.
      int i, j, max = 0;
      //For loop iterate over Array Length & Initialized to 1
      for (i = 0; i < arr_len; i++)
      {
         seq_arr[i] = 1;
      }
       
      //Used to Check if 1srt Element equal to 2nd Element
      for (i = 1; i < arr_len; i++)
       {
    	  for (j = 0; j < i; j++)
    	  	{
    		  //
    		  	if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1) {
    	 
     
    		  			seq_arr[i] = seq_arr[j] + 1;
    		  	}
    	  	}
       }
      //Pick maximum of all LongestIncreasingSubsequence values 
      for (i = 0; i < arr_len; i++)
      {  
    	  if (max < seq_arr[i]) {
    		  max = seq_arr[i];
    	  }
      }
      return max;
   }
   public static void main(String args[]){
	   
	   
      int Arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80 };
	
      int arr_len = Arr.length;
      System.out.println("\nThe Original Array Length:->\t"+arr_len);
      
      System.out.println("\nThe Length of the Longest Increasing Subsequence is:-> \t" +  Longest_Increasing_Subsequence(Arr, arr_len));
   }
}