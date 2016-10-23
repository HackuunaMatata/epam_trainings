package com.sasha.SE_03.Task2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Александра on 23.10.2016.
 */
public class ResourceAnswer {
    private ResourceBundle bundle;
    public ResourceAnswer(Locale locale){
        bundle = ResourceBundle.getBundle("com.sasha.SE_03.Task2.resources.answer", locale);
    }
    public String getValue(String key){
        return bundle.getString(key);
    }
}
