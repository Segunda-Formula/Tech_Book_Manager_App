package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nGestor de Libros Técnicos de Programación\n 1. Añadir libro\n 2. Ver todos los libros\n 3. Eliminar libro\n 4. Cambiar repositorio\n 5. Salir\n Seleccione una opción: ");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 5.");
            }
            switch (opcion) {
                case 1:
                    System.out.println("Opción 1: Añadir libro");
                    break;

                case 2:
                    System.out.println("Opción 2: Ver todos los libros");
                    break;

                case 3:
                    System.out.println("Opción 3: Eliminar libro");
                    break;

                case 4:
                    System.out.println("Opción 4: Cambiar repositorio");

                case 5:
                    System.out.println("Opción 5: Salir");
                    break;

            }
        } while (opcion != 5);
    }
}