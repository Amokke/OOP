package org.example.lesson4.cw.task1;

import java.util.ArrayList;
import java.util.List;

public class LRUCache <E>{
    ArrayList<E> listE;
    int size;
    public LRUCache(int size){
        this.size = size;
        listE = new ArrayList<>();
    }
    public ArrayList<E> getListE(){
        return listE;
    }
    public void setListE(ArrayList<E> listE){
        this.listE = listE;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addElement(E employee) {
        if (listE.size() > size){
            listE.remove(0);
        }
        this.listE.add(employee);
    }
    public E getElement(int ind){
        if (ind >= listE.size()){
            return null;
        }
        return this.listE.get(ind);
    }
    public List<E> getAllElement(){
        return this.listE;
    }
}
