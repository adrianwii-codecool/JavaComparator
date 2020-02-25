package com.company.comparators;

import com.company.Pillow;

import java.util.Comparator;

public class PriceComparator implements Comparator<Pillow> {
    @Override
    public int compare(Pillow o, Pillow o2) {
        return o.getPrice() - o2.getPrice();
    }
}
