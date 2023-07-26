package org.astanait.edu.kz;

import org.astanait.edu.kz.Interface.MyList;
import org.w3c.dom.Node;

public class MyArrayList<T> implements MyList {
    private Object[] arr;
    private int size;

    public MyArrayList(){
        this.arr = (Object[]) new Object[5];
        this.size = 0;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;

    }

    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }
    private void increaseBuffer(){
        Object[] newArr = (Object[]) new Object[arr.length*2];
        for(int i=0; i<size; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
    @Override
    public void add(Object item, int index) {
        checkIndex(index);
        if(size == arr.length){
            increaseBuffer();
        }
        for(int i = size -1 ; i>= index; i--){
            arr[i] = arr[i+1];
        }
        arr[index] = item;
    }
    private void checkIndex(int index){
        if(index<0 && index>=size){
            System.out.println("Index does not exist");
        }
    }
    @Override
    public boolean remove(Object item) {
        int index=0;
        boolean found = false;
        for(int i=0; i<size; i++){
            if(arr[i]==item){
                index = i;
                found=true;
            }
        }
        if(found){
            remove(index);
        }
        return found;
    }

    @Override
    public Object remove(int index) {
        Object temp = arr[index];
        for(int i=index-1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
        return temp;
    }

    @Override
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }


}