package com.sasha.SE_06.Task2;

import java.util.Map;
import java.util.Set;

/**
 * Created by Александра on 06.11.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        GetProperties properties = new GetProperties("com.sasha.SE_06.Task2.prop");
        System.out.println(properties);

        Map<String, String> map = properties.getMap();
        map.put("value4", "mimomimo");

        Set<String> set  = map.keySet();
        for (String key : set){
            System.out.println(key + " = " + map.get(key));
        }
    }
}
