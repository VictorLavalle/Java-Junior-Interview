package com.interview;

public class WordsSorting {

    String[] palabras = {"Hola", "es", "prueba", "para", "una", "entrevista"};

    // Ordenar las cadenas por longitud
    ordenarPorLongitud(palabras);

    // Imprimir las cadenas ordenadas
        System.out.println("Cadenas ordenadas de menor a mayor longitud:");
        for (String palabra : palabras) {
        System.out.println(palabra);
    }

        
}
