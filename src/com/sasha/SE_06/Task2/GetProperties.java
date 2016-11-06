package com.sasha.SE_06.Task2;

import java.util.*;

/**
 * Created by Александра on 06.11.2016.
 */
public class GetProperties {
    private Map<String, String> map = new HashMap<>();
    private ResourceBundle bundle;

    public GetProperties(String path) {
        try {
            bundle = ResourceBundle.getBundle(path);
            fillingOfMap();
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public GetProperties(String path, Locale locale) {
        try {
            bundle = ResourceBundle.getBundle(path, locale);
            fillingOfMap();
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    private void fillingOfMap() {
        Set<String> set = bundle.keySet();
        for (String s : set) {
            map.put(s, bundle.getString(s));
        }
    }

    @Override
    public String toString() {
        return "GetProperties{" +
                "map=" + map +
                '}';
    }

    public Map<String, String> getMap() {
        return map;
    }
}
