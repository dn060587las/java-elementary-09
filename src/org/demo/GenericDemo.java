package org.demo;

import java.util.*;

class Parent implements GrandParent, GrandParent2 { }
interface GrandParent { }
interface GrandParent2 { }
class Child extends Parent {}

class Storage<T>  {

    List<T> innerStore;

    public void addToStore(T valueToAdd) {
        innerStore.add(valueToAdd);
    }

    public <T2 extends Number> void  printObjectToConsole(T2 param) {
        System.out.println(param);
    }
}

class ParentProcessor<T extends Parent & GrandParent & GrandParent2> {

}

public class GenericDemo {

    public static void main(String[] args) {
        List<Parent> list = new ArrayList<>();
        list.add(new Parent());
        list.add(new Child());
        ///Set implementations
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println("Set1");
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            System.out.println("Value is " + val);
        }
        //
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        iter = set2.iterator();
        System.out.println("Set2");
        while (iter.hasNext()) {
            Integer val = iter.next();
            System.out.println("Value is " + val);
        }
        //
        Set<Integer> set3 = new TreeSet<>();
        set3.add(3);
        set3.add(2);
        set3.add(1);
        System.out.println("Set3");
        iter = set3.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            System.out.println("Value is " + val);
        }
        Storage<Integer> storage = new Storage<>();
        Storage<String> storage2 = new Storage<>();
        ParentProcessor<Parent> parentProcessor;
        ParentProcessor<Child> parentProcessor2;
        storage.printObjectToConsole(3);
    }
}
