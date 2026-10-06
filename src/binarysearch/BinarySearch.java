/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author jaccc
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num[] = {8,4,6,3,5,11,22,33,13};
        int key = 33;
        
      /*  //output array
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        
        for(int i = 0; i < num.length; i++){
            
            if(num[i] == key){
                System.out.println("Linear Search");
                System.out.println("Item found at index " + i);
            }
            
        }
        
        
      */
        
        
        
        // sort array
          Arrays.sort(num);
        //output array
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        // set low and high and mid
        // low = num[0], high = num.lenght, mid= (low + high) /2
        
        int high = num.length -1;
        int low = 0;
        int mid =(high + low)/2;
        boolean wasRe = false;
        
       //loop starts while mid value is not equal to key and low is not greater or equal to high
        while(num[mid] != key && low<=high){
        mid =(high + low)/2;  
        // if key is equal to mid, finish and return mid value which is key
        if(num[mid]==key){
            System.out.println("\nItem found at index " + mid);
            wasRe = true;
            break;
        }
        else if(num[mid]< key){
            low = mid +1;
        }
        else  if(num[mid]> key){
            high = mid -1;
        }
        
        }
        
        if(!wasRe){
            System.out.println("\n Item was not found");
        }
        // if mid is higher than key, low = mid +1
        // if mid is lower than key, high = mid +1
        // repeat 
        
        //loop ends
        
        //if found wasRe = true, else !, output different message
    }
  
    
}
