package com.company.comparators;

import com.company.Pillow;

import java.util.Comparator;

public class SoftnessComparator implements Comparator<Pillow> {
    @Override
    public int compare(Pillow o, Pillow o2) {
        return o.getSoftness() - o2.getSoftness();
    }
}
