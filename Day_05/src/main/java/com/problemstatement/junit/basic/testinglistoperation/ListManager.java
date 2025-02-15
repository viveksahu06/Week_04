package com.problemstatement.junit.basic.testinglistoperation;

import java.util.List;

public class ListManager {

    //Adding element to list
    public void addElement(List<Integer>list,int element){
        if(list!=null){
            list.add(element);
        }
    }

    //Removing element from list
    public boolean removeElement(List<Integer>list, int element){
        if(list!=null){
            return list.remove(Integer.valueOf(element));
        }
        return false;
    }

    //Getting size of list
    public int getsize(List<Integer>list){
        return (list!=null)? list.size():0;
    }
}
