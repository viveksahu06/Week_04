package listinterface;

import org.collectionframwork.listinterface.frequencyofelement.FrequencyOfElements;
import org.collectionframwork.listinterface.listrotation.RotateListKPosition;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ListRotationTesting {
    @Test
    public void listRotationtest(){
        //sample list to rotate
        List<Integer>list = Arrays.asList(10,20,30,50,60);
        //number of the positions to  rotate
        int positions =2;

        List<Integer>required= Arrays.asList(30,50,60,10,20);
        list = new RotateListKPosition().rotateListKPosition(list,positions);
        //compare result
        assertEquals(list,required);
        System.out.println("Test Case Passed");
    }
    @Test
    public void listRotationtestForString(){
        //sample string list to rotate
        List<String>list = Arrays.asList("vivek","suraj","pratham","vinisha","dee...");
        //number of the positions to  rotate
        int positions =3;

        List<String>required= Arrays.asList("vinisha", "dee...","vivek","suraj","pratham");
        list = new RotateListKPosition().rotateListKPosition(list,positions);
        //compare result
        assertEquals(list,required);
        System.out.println("Test Case Passed for String");
    }
}
