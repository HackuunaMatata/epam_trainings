package com.sasha.SE_05.Task2;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by Александра on 06.11.2016.
 */
public class ResourceProperties {
    private ResourceBundle bundle;

    public ResourceProperties(String path, Locale locale) {
        try {
            bundle = ResourceBundle.getBundle(path, locale);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public ResourceProperties(String path) {
        try {
            bundle = ResourceBundle.getBundle(path);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public String getValue(String key) {
        try {
            return bundle.getString(key);
        } catch (NullPointerException e) {
            System.out.println("File isn't found");
        } catch (MissingResourceException e) {
            System.out.println("Incorrect value of a key");
        }
        return "error";
    }
}
