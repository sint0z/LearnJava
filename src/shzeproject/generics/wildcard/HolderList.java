package shzeproject.generics.wildcard;

import shzeproject.generics.Holder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HolderList {

    public static void holderList(Holder<List<?>> holderList){
        List<String> listString = new ArrayList<>();
        Collections.addAll(listString,"StringONE", "StringTWO");
        holderList.set(listString);
        List<?> list = holderList.get();
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(holderList.isNull());
    }

    public static void listHolder(List<Holder<?>> listHolder){
        System.out.println(listHolder.size());
        System.out.println(listHolder.getFirst());
        System.out.println(listHolder);
        for(Holder<?> holder : listHolder){
            System.out.println(holder.get());

        }
    }
    public static void main(String[] args) {
        holderList(new Holder<List<?>>());

        List<Holder<?>> list = new ArrayList<>();
        Holder<String> h1 = new Holder<>();
        h1.set("String");
        list.add(h1);
        listHolder(list);
    }
}
