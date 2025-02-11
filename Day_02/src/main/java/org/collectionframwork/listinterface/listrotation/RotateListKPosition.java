//Rotate Elements in a List
//Rotate the elements of a list by a given number of positions.
//Example:
//Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
package org.collectionframwork.listinterface.listrotation;

import java.util.List;

public class RotateListKPosition {
    //method to swap elements
    private <T>void swap(List<T> items,int left, int right){
       while(left<right){
            T temp = items.get(left);
            items.set(left, items.get(right));
            items.set(right, temp);
            left++;
            right--;
        }
    }
    //method to rotate list to k positions
    public <T> List<T> rotateListKPosition(List<T> items, int k){
        int totalRotation = k%items.size();
        //swap first k items
        swap(items, 0 , k-1);
        //swap n items except k-1 items
        swap(items,totalRotation,items.size()-1);
        //swap 0 to n items
        swap(items,0, items.size()-1);
        return items;
    }
}
