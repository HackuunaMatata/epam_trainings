package com.sasha.SE_03.Task2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Александра on 23.10.2016.
 */
public class ResourceQuestion {
    private ResourceBundle bundle;
    public ResourceQuestion(Locale locale){
        bundle = ResourceBundle.getBundle("com.sasha.SE_03.Task2.resources.question", locale);
    }
    public String getValue(String key){
        return bundle.getString(key);
    }
}
