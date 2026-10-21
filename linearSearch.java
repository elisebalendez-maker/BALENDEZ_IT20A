/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERM;

/**
 *
 * @author admin
 */
public class linearSearch {
      public static int search (int [] arr, int target){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == target){
        }
        }
        return-1;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int result = search (arr, 4);
        
        if (result >= 2){
            System.out.println("found at index" + result + "=" + arr[result]);
        }else{
            System.out.println("Element not found");
        }
    }
    
}
    
