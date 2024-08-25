package com.example.makeup_peeker;

import java.util.ArrayList;
import java.util.List;

public class MakeupExpert {
    List<String> getbrands(String products) {
        List<String> brands = new ArrayList<>();
        if (products.equals("Foundation")) {
            brands.add("Milani");
            brands.add("Wet n Wild");
            brands.add("Fit me ( mabillain)");
            brands.add("super stay 30h( mabillain)");
            brands.add("super stay 24h( mabillain)");
        } else if (products.equals("Blush")) {
            brands.add("Relovution");
            brands.add("Sheglam");
            brands.add("Technique");
        } else if (products.equals("Eyeshadow")) {
            brands.add(" Hudabeauty");
            brands.add("Relovution");
            brands.add("Wet n Wild");
        } else if (products.equals("Eyeliner")) {
            brands.add(" W7");
            brands.add("Lakme");
            brands.add("Mr & Mrs");
        } else {
            brands.add("Milani");
            brands.add("Wet n Wild");
            brands.add("Revlon");
            brands.add("Absolute Newyork(super slim)");
        }
        return brands;
    }
}
