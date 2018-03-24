/* This class stores the list of memento objects
    and lets us access the different states
 */
package com.company;
import java.util.ArrayList;
import java.util.List;


public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
    public int length(){
        return mementoList.size();
    }
}