/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimingSearchingandSortingAlgorithms;

/**
 *
 * @author fachr
 */
public class IntegerList {
 int[] list; //values in the list 
 //------------------------------------------------------------ 
 // Constructor -- takes an integer and creates a list of that 
 // size. All elements default to value 0. 
 //------------------------------------------------------------ 
 public IntegerList(int size) 
 { 
 list = new int[size]; 
 }    
 //------------------------------------------------------------ 
 // randomize -- fills the array with randomly generated integers 
 // between 1 and 100, inclusive 
 //------------------------------------------------------------ 
 public void randomize() 
 { 
 int max = list.length; 
 for (int i=0; i<list.length; i++) 
 list[i] = (int)(Math.random() * max) + 1; 
 } 
//------------------------------------------------------------ 
 // fillSorted -- fills the array with sorted values 
 //------------------------------------------------------------ 
 public void fillSorted() 
 { 
 for (int i=0; i<list.length; i++) 
 list[i] = i + 2; 
 } 
 //------------------------------------------------------------ 
 // print -- prints array elements with indices, one per line 
 //------------------------------------------------------------ 
 @Override
 public String toString() 
 { 
 String s = ""; 
 for (int i=0; i<list.length; i++) 
 s += i + ":\t" + list[i] + "\n"; 
 return s; 
 } 
 //------------------------------------------------------------ 
 // linearSearch -- takes a target value and returns the index 
 // of the first occurrence of target in the list. Returns -1 
 // if target does not appear in the list 
 //------------------------------------------------------------ 
 public int linearSearch(int target) 
 { 
 int location = -1; 
 for (int i=0; i<list.length && location == -1; i++) 
 if (list[i] == target) 
     location = i; 
 return location; 
 } 
 //------------------------------------------------------------ 
 // sortIncreasing -- uses selection sort 
 //------------------------------------------------------------ 
 public void sortIncreasing() 
 { 
 for (int i=0; i<list.length-1; i++) 
 { 
 int minIndex = minIndex(list, i); 
 swap(list, i, minIndex); 
 } 
 }

    private int minIndex(int[] list, int i) {
        int result = i;
        for (int j=i+1; j < list.length; j++){
            if (list[j] < list[i]) 
            result = j; 
        } 
    return result;
    }

    private void swap(int[] list, int i, int minIndex) {
            int temp = list[i]; 
            list[i] = list[minIndex]; 
            list[minIndex] = temp;
    }

    int binarySearch(int val) {
           int size  = list.length;
        int locate = bs(list, 0, size-1, val);
        return locate;
    }

    void sortDecreasing() {
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
        int bs(int arr[], int l, int r, int x) 
    { 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 

        if (arr[mid] == x) 
            return mid; 

        if (arr[mid] > x) 
            return bs(arr, l, mid - 1, x); 

        return bs(arr, mid + 1, r, x); 
    } 
    
    return -1; 
    } 
}
