package com.company;

import java.util.*;

/**
 * Created by gulnur on 22.10.16.
 */
public class CountMapIml<E> implements CountMap<E> {

    private E[] elements;
    private int[] counts;
    private int size;
    private int count;



    private static final int DEFAULT_CAPACITY = 5;


    @SuppressWarnings("unchecked")
    private void resize() {
        E[] ob;
        int[] con;
        ob = elements;
        con = counts;
        size = size + DEFAULT_CAPACITY;
        this.elements = (E[]) new Object[size];
        this.counts = new int[size];
        for (int j = 0; j < count; j++) {
            this.elements[j] = ob[j];
            this.counts[j] = con[j];
        }

    }

    private int find(E e){
        int ix = -1;
        for (int i = 0; i < count; i++){
            if (elements[i] == e){
                ix = i;
                break;
            }
        }
        return ix;
    }

    @SuppressWarnings("unchecked")
    public CountMapIml(){
        size = DEFAULT_CAPACITY;
        this.elements =(E[]) new Object[DEFAULT_CAPACITY];
        this.counts = new int[DEFAULT_CAPACITY];
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(E e) {

        if (count >= size) {
            resize();
        }
        if (find(e) == -1) {
            this.elements[count] = e;
            this.counts[count] = 1;
            count++;
        } else {
            this.counts[find(e)] += 1;
        }
    }


    @Override
    public void print(){
        System.out.println("PRINTPRINTPRINT");
        for(int i = 0; i < size; i++){
            System.out.println(this.counts[i]);
            System.out.println(this.elements[i]);
        }
    }

    @Override
    public Map toMap() {
        Map<E, Integer> mapp = new HashMap<E, Integer>();
        for (int i = 0; i < count; i++){
            mapp.put(elements[i], counts[i]);
        }
        return mapp;

    }

    @Override
    public void addAll(CountMap<? extends E> source) {
        for(int i = 0; i < source.size(); i++ ){
            add(source.getElement(i));
        }
    }

    @Override
    public int getCount(E e) {
        return this.counts[find(e)];
    }

    @Override
    public E getElement(int i){
        return (E) elements[i];
    }

    @Override
    public int remove(E e) {
        int index = find(e);
        E val = this.elements[index];
        int ret = counts[index];
        int numMoved = count - index - 1;
        if (numMoved > 0){
            System.arraycopy(elements, index+1, elements, index, numMoved);
            System.arraycopy(counts, index+1, counts, index, numMoved);
        }
        elements[--count] = null;
        counts[--count] = 0;
        return ret;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void toMap(Map<? super E, Integer> destination) {
        for (int i = 0; i < count; i++){
            destination.put(elements[i], counts[i]);
        }

    }
}
