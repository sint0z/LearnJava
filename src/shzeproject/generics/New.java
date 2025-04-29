package shzeproject.generics;

import java.io.FileInputStream;
import java.util.*;

import shzeproject.rtti.typeinfo.pets.IPet;


public class New {
    public static <K,V> Map<K,V> map(){
        return new HashMap<>();
    }

    public static <T> List<T> list(){
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> lList(){
        return new LinkedList<>();
    }

    public static <T> Set<T> set(){
        return new HashSet<>();
    }

    public static <T> Queue<T> queue(){
        return new LinkedList<>();
    }
}
