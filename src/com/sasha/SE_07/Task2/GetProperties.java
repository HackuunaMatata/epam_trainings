package com.sasha.SE_07.Task2;

import java.nio.file.Path;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by Александра on 13.11.2016.
 */
public class GetProperties implements Runnable {
    private ResourceBundle bundle = null;
    private String path = null;
    private Locale locale = null;

    public GetProperties(String path) {
        this.path = path;
    }

    public GetProperties(String path, Locale locale) {
        this.path = path;
        this.locale = locale;
    }

    public void setBundle() {
        try {
            bundle = ResourceBundle.getBundle(path);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public void setBundleLocale() {
        try {
            bundle = ResourceBundle.getBundle(path, locale);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public void print() {
        Set<String> z = bundle.keySet();
        for (String key : z) {
            System.out.println(key + " = " + bundle.getString(key));
        }
        System.out.println();
    }

    @Override
    public void run() {
        if (locale != null) setBundleLocale();
        else setBundle();
        synchronized (bundle) {
            print();
        }
    }
}
