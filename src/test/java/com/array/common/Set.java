package com.array.common;

import java.util.Arrays;

/**
 * Created by daniel.huertas on 9/16/2015.
 */
public class Set {
    int size = 0;
    Object[] elements;

    public Set(){
        elements = new Object[10];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(Object value){
        if(!this.contains(value)){
            if(isFull()){
                grow();
            }
            elements[size++] = value;
        }
    }

    public void remove (Object value){
        boolean match = false;
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == value){
                match = true;
            }

            if (match && i < elements.length - 1){
                elements[i] = elements[i+1];
            }
            else if(i == elements.length - 1){
                elements[i] = null;
            }
        }
        size--;
    }
    public int indexOf (Object value){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(elements[i] == value){
                index = i;
                break;
            }
        }

        return index;
    }

    public boolean contains(Object value){
        return indexOf(value) != -1;
    }

    public boolean isFull(){
        return size == elements.length;
    }

    public void grow(){
        Object[] mergedElements = new Object[size * 2];

        for(int i = 0; i < size; i++){
            mergedElements[i] = elements[i];
        }
        elements = mergedElements;
    }

    @Override
    public String toString() {
        return "Set{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
