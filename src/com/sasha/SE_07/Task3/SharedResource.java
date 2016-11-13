package com.sasha.SE_07.Task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александра on 14.11.2016.
 */
public class SharedResource {
    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<>();
    }

    public void setElement(Integer element) {
        list.add(element);
    }

    public Integer getElement() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

}
