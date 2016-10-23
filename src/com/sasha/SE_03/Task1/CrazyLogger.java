package com.sasha.SE_03.Task1;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by Александра on 23.10.2016.
 */
public class CrazyLogger {
    private String name;
    private StringBuilder log;
    private Calendar date;
    private Formatter formatter;

    public CrazyLogger(String name) {
        log = new StringBuilder();
        this.name = name;
    }

    public void addMessage(String message){
        date = Calendar.getInstance();
        formatter = new Formatter();
        formatter.format("%td-%tm-%tY:%tR - %s;\n", date, date, date, date, message);
        log.append(formatter);
        System.out.println("Message is added");
    }

    public String findMessage(String message) {
        int index = log.indexOf(message);
        if(index == -1) return "Message doesn't found";
        String string = log.substring(index-19, index+message.length());
        return string;
    }
}
