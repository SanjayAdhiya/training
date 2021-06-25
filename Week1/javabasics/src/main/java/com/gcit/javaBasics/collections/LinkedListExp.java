package com.gcit.javaBasics.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {
	//create
    static LinkedList<String> list=new LinkedList<String>();
	//add
    public static void one() {

        	list.add("one");
        	list.add("two");

        	list.add("three");
        	list.add("four");
        	list.add("five");
        	list.add("six");
        	
        	//search and update
            list.addFirst("extra1");
            list.addLast("extra1");
            list.add(2, "extra2");
        	//delete
            list.removeAll(list);

            Iterator<String> iterator=list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
              }

	}
}
