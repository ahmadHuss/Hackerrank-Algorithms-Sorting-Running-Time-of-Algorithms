import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<s;i++){
            arr[i]=in.nextInt(); 
        }
        		Insertion(arr);
		//PrintIt(arr);
	
	}
		
		//Insertion Sort
	
	private static void Insertion(int [] arr){
	
		
		int n = arr.length;
		int passes =0;
	  for(int i=1;i<n;i++){
		  
		  int SelectedValue = arr[i];
		  
		  int indexPosition = i;
		  
		  while(indexPosition > 0 && arr[indexPosition-1]> SelectedValue){
			  
			  arr[indexPosition] = arr[indexPosition-1];
			
			  passes++;
			  indexPosition--;
		  }//while loop end
		  
		 
		  arr[indexPosition] = SelectedValue; 
		  
	  }//for loop exit
	
	  System.out.println(passes);
		
	}
}