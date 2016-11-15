package com.company;

import java.util.*;

public class CollectionUtils {

    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {

        destination.addAll(source);

    }



    public static<T> List newArrayList() {
        List<? extends T> l = new ArrayList();
        return l;
    }



    public static<T> int indexOf(List<? extends T> source, T o) {
        int ret = -1;
        for(int i = 0; i < source.size(); i++ ){
            if (source.get(i) == o) {
                ret = i;
            }
        }
        return ret;
    }



    public static<T> List limit(List<? extends T> source, int size) {
        if (size > source.size()) {
            return source;
        }
        else {
            List<T> l = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                l.add(source.get(i));
            }
            return l;
        }
    }



    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }



    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        for (int i = 0; i < c2.size(); i++) {
            removeFrom.remove(c2.get(i));
        }

    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        boolean ret = false;
        if (c1.containsAll(c2)){
            ret = true;
        }
        return ret;

    }



    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        boolean ret = false;
        for(int i = 0; i < c2.size(); i++){
            if (c1.contains(c2.get(i))){
                ret = true;
            }
        }
        return ret;

    }



    public static<T extends Comparable> List range(List<? extends T> list, Object min, Object max) {
        List<T> l1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(min) >= 0 && list.get(i).compareTo(max) <= 0) {
                l1.add(list.get(i));
            }
        }
        return l1;
    }

    public static<T> List range(List<? extends T> list, Object min,
                                Object max, Comparator comparator) {
        List<T> l1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (comparator.compare(list.get(i), min) >= 0 &&
                    comparator.compare(list.get(i), max) <= 0) {
                l1.add(list.get(i));
            }
        }
        return l1;
    }


}
