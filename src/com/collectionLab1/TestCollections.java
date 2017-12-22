package com.collectionLab1;

//import java.util.*;

/**
 * Created by Balaji on 2/11/17.
 */
public class TestCollections {
    String name;
    static int objCount;
    static int destroyCount=0;


    public TestCollections(String name) {
        this.name = name;
        objCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name);
        destroyCount--;
    }

    public static void main(String[] args) {
     /*   String s=new String("Ramu");
        Collection collection=new ArrayList();
        Collection collection2=new ArrayList();
        System.out.println("add "+collection.add("Ramu"));
        System.out.println("add "+collection2.add("Ramu"));
        System.out.println("add "+collection2.add("Raja"));
        System.out.println("add "+collection.add("Raja"));
        System.out.println("add "+collection.add("Vicky"));
        System.out.println("add "+collection.add("Gokul"));
        System.out.println("add "+collection.add("Somu"));
        System.out.println("add dub-->"+collection.add("Ramu"));
        System.out.println("contains ramu-->"+collection.contains(s));
        System.out.println("size-->"+collection.size());
        //System.out.println("remove ramu-->"+collection.remove(s));
        //System.out.println("remove ramu-->"+collection.remove(s));
        //System.out.println("remove-->"+collection.remove(s));
        //collection.clear();
        //System.out.println("Is empty-->"+collection.isEmpty());
        System.out.println("addth:src="@{-->"+collection.addth:src="@{(collection));
        System.out.println(collection.size());
        System.out.println(collection);
        //System.out.println("removeth:src="@{-->"+collection.removeth:src="@{(collection));
        //System.out.println(collection.size());
        System.out.println("retainth:src="@{-->"+collection.retainth:src="@{(collection2));
        System.out.println(collection2);

        List <Integer> l=new ArrayList<Integer>();
        Integer i=10;
        System.out.println(--i);
     */
        System.err.println("main starting..");
        for (int i = 0; i <100000 ; i++) {
            TestCollections t=new TestCollections("Test"+i);
        }
        System.err.println("Count-->"+objCount+" destroyed-->"+destroyCount);

    }

}
