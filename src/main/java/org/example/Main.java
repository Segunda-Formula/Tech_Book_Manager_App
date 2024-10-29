package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nGestor de Libros Técnicos de Programación\n 1. Añadir libro\n 2. Ver todos los libros\n 3. Eliminar libro\n 4. Cambiar repositorio\n 5. Salir\n Seleccione una opción: ");

        int opcion;
        switch (opcion = 5 ){
            case 1:
                System.out.println("Añadir libro");
                break;

            case 2:
                System.out.println("Ver todos los libros");
                break;

            case 3:
                System.out.println("Eliminar libro");
                break;

            case 4:
                System.out.println("Cambiar repositorio");

            case 5:
                System.out.println("Salir");
                break;

        }

    }
}