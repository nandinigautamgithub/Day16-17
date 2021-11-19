package com.day16;

public class BinarySearch {
	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  

	public static void main(String[] args) {  
		  int arr[] = {15,25,35,45,65,75,85,95};  
	        int key = 45;  
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     
	

	}

}
