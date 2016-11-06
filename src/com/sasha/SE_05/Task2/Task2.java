package com.sasha.SE_05.Task2;

import java.util.Locale;

/**
 * Created by Александра on 06.11.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        ResourceProperties resourceProperties = new ResourceProperties("com.sasha.SE_05.Task2.prop");
        System.out.println(resourceProperties.getValue("value1"));
        System.out.println("============");

        ResourceProperties resourceProperties1 = new ResourceProperties("com.sasha.SE_05.Task2.prop", Locale.ENGLISH);
        System.out.println(resourceProperties1.getValue("value2"));
        System.out.println("============");

        ResourceProperties resourceProperties2 = new ResourceProperties("com.sasha.SE_05.Task2.prop", Locale.CHINA);
        System.out.println(resourceProperties2.getValue("value7"));
        System.out.println("============");

        ResourceProperties resourceProperties3 = new ResourceProperties("com.sasha.SE_04.Task2.prop");
        System.out.println(resourceProperties3.getValue("value3"));
        System.out.println("============");

    }
}
