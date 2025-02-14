/*4. Multiple Catch Blocks
*/
package com.exceptionhandling.multiplecatchblocks;

import java.util.Scanner;

//Creating MultipleCatchBlocks class
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner sc = new Scanner(System.in);
        try {
            //Taking array size as input
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            //Creating array
            int[] arr = new int[n];

            //Taking array elements as input
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //Setting array to null
            arr = null;

            //Taking index as input
            System.out.println("Enter an index of the element for retrieval: ");
            int index = sc.nextInt();

            //Retrieving value at the given index
            System.out.print("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //Handling invalid index exception
            System.out.println("Invalid index! - " + e.getMessage());
        }
        catch (NullPointerException e) {
            //Handling null array exception
            System.out.println("Array is not initialized! " + e.getMessage());
        }
    }
}
