package com.sasha.SE_01.Task6;

import java.util.ArrayList;

/**
 * Created by Александра on 02.10.2016.
 */
public class Notepad {
    int lastNumRecord;
    String name;
    ArrayList<Record> records;

    public Notepad(String name) {
        this.name = name;
        records = new ArrayList<>();
    }


    public void addRecord(String text) {
        Record record = new Record(text, lastNumRecord++);
        records.add(record);
        System.out.println("Record is added!");
    }

    public void deleteRecord(String text) {
        for (Record record : records) {
            if (record.text.equals(text)) {
                records.remove(record);
            }
        }
        System.out.println("Record is deleted!");
    }

    public void editRecord(String text, String newText) {
        for (Record record : records) {
            if (record.text.equals(text)) {
                record.text=newText;
            }
        }
        System.out.println("Record is edited!");
    }

    public void lookAllRecords(){
        for (Record record : records) {
            System.out.println("Nodepad's name: " + name + "     record's number: " + record.currentNum + "   text in record: " + record.text);
        }
    }

}
