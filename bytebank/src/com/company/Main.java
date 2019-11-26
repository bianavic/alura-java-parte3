package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        notas.add(1);
        notas.add(null);
        notas.add(10);

        System.out.println(notas);

        notas = notas.stream()
                .filter(nota -> nota !=null)
                .filter(nota -> nota % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(notas);
    }
}
