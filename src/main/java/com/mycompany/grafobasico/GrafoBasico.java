
package com.mycompany.grafobasico;

import java.util.Scanner;

public class GrafoBasico {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Grafo grafo = new Grafo();

        int opcion;
        String nombre;
        String origen;
        String destino;

        do {
            System.out.println("\n===== MENU DEL GRAFO =====");
            System.out.println("1. Insertar vertice");
            System.out.println("2. Insertar arista");
            System.out.println("3. Buscar vertice");
            System.out.println("4. Mostrar grafo");
            System.out.println("5. Eliminar arista");
            System.out.println("6. Eliminar vertice");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del vertice: ");
                    nombre = teclado.nextLine();
                    grafo.insertarVertice(nombre);
                    break;

                case 2:
                    System.out.print("Ingrese el vertice de origen: ");
                    origen = teclado.nextLine();

                    System.out.print("Ingrese el vertice de destino: ");
                    destino = teclado.nextLine();

                    grafo.insertarArista(origen, destino);
                    break;

                case 3:
                    System.out.print("Ingrese el vertice a buscar: ");
                    nombre = teclado.nextLine();
                    grafo.buscarVertice(nombre);
                    break;

                case 4:
                    grafo.mostrarGrafo();
                    break;

                case 5:
                    System.out.print("Ingrese el vertice de origen: ");
                    origen = teclado.nextLine();

                    System.out.print("Ingrese el vertice de destino: ");
                    destino = teclado.nextLine();

                    grafo.eliminarArista(origen, destino);
                    break;

                case 6:
                    System.out.print("Ingrese el vertice a eliminar: ");
                    nombre = teclado.nextLine();
                    grafo.eliminarVertice(nombre);
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 7);

        teclado.close();
    }
}
