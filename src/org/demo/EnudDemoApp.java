package org.demo;

public class EnudDemoApp {

    public static void main(String[] args) {
        EnumDemo demo = EnumDemo.MONDAY;
        EnumDemo demo2 = EnumDemo.MONDAY;
        System.out.println(demo == demo2);
    }

    public static void demoEnum(EnumDemo enumVar) {

    }
}
