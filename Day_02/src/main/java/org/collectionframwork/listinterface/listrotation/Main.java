package org.collectionframwork.listinterface.listrotation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //list
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        //positions to move
        int k=2;
        //object of the class
        RotateListKPosition rotateListKPosition = new RotateListKPosition();
        //storing the result
        list=rotateListKPosition.rotateListKPosition(list,2);
        //displaying the output
        System.out.println(list);
    }
}
