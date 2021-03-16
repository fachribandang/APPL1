/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingandSortingInAnIntegerList;
// **************************************************************** 
// IntegerList.java 
// 
// Define an IntegerList class with methods to create, fill, 
// sort, and search in a list of integers. 
// 
// **************************************************************** 
import java.util.Scanner;
public class IntegerList 
{ 
 int[] list; //values in the list 
 //------------------------------------------------------- 
 //create a list of the given size 
 //------------------------------------------------------- 
    public IntegerList(int size) 
    { 
       list = new int[size]; 
    } 
 //------------------------------------------------------- 
 //fill array with integers between 1 and 100, inclusive 
 //------------------------------------------------------- 
    public void randomize() 
    { 
        for (int i=0; i<list.length; i++) 
        list[i] = (int)(Math.random() * 100) + 1; 
    } 
 //------------------------------------------------------- 
 //print array elements with indices 
 //------------------------------------------------------- 
    public void print() 
    { 
        for (int i=0; i<list.length; i++) 
        System.out.println(i + ":\t" + list[i]); 
    } 
 //------------------------------------------------------- 
 //return the index of the first occurrence of target in the list. 
 //return -1 if target does not appear in the list 
 //------------------------------------------------------- 
    public int search(int target) 
    { 
        int location = -1; 
        for (int i=0; i<list.length && location == -1; i++) 
        if (list[i] == target) 
        location = i; 
        return location; 
    } 
 //------------------------------------------------------- 
 //sort the list into ascending order using the selection sort algorithm 
 //------------------------------------------------------- 
    public void sortIncreasing() 
    { 
    int minIndex; 
        for (int i=0; i < list.length-1; i++) 
        { 
            //find smallest element in list starting at location i 
            minIndex = i; 
            for (int j = i+1; j < list.length; j++) 
            if (list[j] < list[minIndex]) 
            minIndex = j; 
            //swap list[i] with smallest element 
            int temp = list[i]; 
           list[i] = list[minIndex]; 
            list[minIndex] = temp; 
        } 
    }
        public void sortDecreasing() 
    { 
    int minIndex; 
        for (int i=0; i < list.length-1; i++) 
        { 
            //find smallest element in list starting at location i 
            minIndex = i; 
            for (int j = i+1; j < list.length; j++) 
            if (list[j] > list[minIndex]) 
            minIndex = j; 
            //swap list[i] with smallest element 
            int temp = list[i]; 
           list[i] = list[minIndex]; 
            list[minIndex] = temp; 
        } 
    }
    public void replaceFirst(int oldVal, int newVal){
        Integer  locate;
        locate = search(oldVal);
            if (locate != null){
                list[locate] = newVal;
            }
    }
    public void replaceAll (int oldVal, int newVal){
        int n = list.length;
        for (int i=0; i<n; i++){
            if (list[i] == oldVal) {
                list [i] = newVal;
            }
        } 
    }
    
    
    int binerySearchD ( int target ){
        int size  = list.length;
        int locate = binarySearch(list, 0, size-1, target);
        return locate;
    }
    int binarySearch(int arr[], int l, int r, int x) 
{ 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        // If the element is present at the middle 
        // itself 
        if (arr[mid] == x) 
            return mid; 
  
        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (arr[mid] > x) 
            return binarySearch(arr, l, mid - 1, x); 
  
        // Else the element can only be present 
        // in right subarray 
        return binarySearch(arr, mid + 1, r, x); 
    } 
  
    // We reach here when element is not 
    // present in array 
    return -1; 
} 
} 
