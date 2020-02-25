package com.company;

import com.company.comparators.PriceComparator;
import com.company.comparators.SoftnessComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pillow> pillows = new ArrayList<>();

        Pillow pillow1 = new Pillow(100, 10, 0.5);
        Pillow pillow2 = new Pillow(200, 8, 1.6);
        Pillow pillow3 = new Pillow(10, 1, 0.7);
        Pillow pillow4 = new Pillow(30, 4, 1.5);

        pillows.add(pillow1);
        pillows.add(pillow2);
        pillows.add(pillow3);
        pillows.add(pillow4);

        System.out.println("Default list of pillows:");
        System.out.println(pillows.toString());

        System.out.println("Pillows list after sort:");
        Collections.sort(pillows);
        System.out.println(pillows.toString());

        System.out.println("Sort by Softness with usage of our SoftnessComparator:");
        Collections.sort(pillows, new SoftnessComparator());
        System.out.println(pillows.toString());

        System.out.println("Sort by Price with usage of our PriceComparator:");
        Collections.sort(pillows, new PriceComparator());
        System.out.println(pillows.toString());

        System.out.println("Compare pillow1 with pillow2:");
        String comparision =
                pillow1.compareTo(pillow2) == 1
                        ? "Pillow 1 is stronger!"
                        : "You can use pillow1 only for sleeping";
        System.out.println(comparision);
    }
}
