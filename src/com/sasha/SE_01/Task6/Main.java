package com.sasha.SE_01.Task6;

/**
 * Created by Александра on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Notepad one = new Notepad("6");

        one.addRecord("Record 1");
        one.addRecord("Record 2");
        one.lookAllRecords();
        one.deleteRecord("Record 1");
        one.lookAllRecords();
        one.editRecord("Record 2", "Record 1");
        one.lookAllRecords();

    }
}
