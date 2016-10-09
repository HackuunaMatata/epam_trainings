package com.sasha.SE_02.Task3_4;

import java.util.Comparator;

/**
 * Created by Александра on 09.10.2016.
 */
public class ByCostComparator implements Comparator<OfficeSupplies> {
    @Override
    public int compare(OfficeSupplies o1, OfficeSupplies o2) {
        return o1.cost-o2.cost;
    }
}
