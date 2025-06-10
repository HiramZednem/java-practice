package com.codqueto.estructurasdedatos.map;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {

        Map<String, Integer> productPrices = new TreeMap<>();

        productPrices.put("Laptop", 1200);
        productPrices.put("SmartPhone", 1000);
        productPrices.put("Tablet", 1500);
        productPrices.put("Airplane", 1320);

        System.out.println(productPrices);

        System.out.println(productPrices.get("Laptop"));

        productPrices.put("Laptop", 1340);

        System.out.println(productPrices);
    }
}
