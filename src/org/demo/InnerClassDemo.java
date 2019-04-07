package org.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

interface Test{ }

interface TestAnonimous {
    void doSomethig();
}

class A {

    private int privateVar = 10;
    private static int staticVar = 3;

    public class InnerA implements Test {
        private int var2 =10;
        public int hetParentPrivateVar() {
            return privateVar;
        }
    }

    public static class InnerAStatic {

        public int getOuterStaticField() {
            return staticVar;
        }

    }

    public Test getPrivateObj(){
        InnerA result = new InnerA();
        result.var2 =45;
        return result;
    }
}

class Demo {
    public void prirnt() {
        System.out.println("Hrllo");
    }
}

public class InnerClassDemo {

    public static void main(String[] args) {
        A aObject = new A();
        Test test = aObject.getPrivateObj();
        A.InnerAStatic innerObj = new  A.InnerAStatic();

        TestAnonimous testAnonimous = new TestAnonimous() {
            @Override
            public void doSomethig() {
                System.out.println("Implementations");
            }
        };

        Demo demo = new Demo() {
            @Override
            public void prirnt() {
                System.out.println("HELLO DEMO");
            }
        };

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Value from set " + integer);
            }
        });

    }
}
