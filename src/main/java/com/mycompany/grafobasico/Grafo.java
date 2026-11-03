package com.mycompany.grafobasico;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Grafo {

    private Map<String, Set<String>> vertices;

    public Grafo() {
        vertices = new HashMap<>();
    }
    public void insertarVertice(String nombre) {
     if (!vertices.containsKey(nombre)) {
        vertices.put(nombre, new HashSet<>());
        System.out.println("Vertice agregado correctamente.");
    } else {
        System.out.println("El vertice ya existe.");
    }
  }
    public void insertarArista(String origen, String destino) {
    if (vertices.containsKey(origen) && vertices.containsKey(destino)) {
        vertices.get(origen).add(destino);
        vertices.get(destino).add(origen);
        System.out.println("Arista agregada correctamente.");
    } else {
        System.out.println("Uno o ambos vertices no existen.");
    }
  }
    public void buscarVertice(String nombre) {
    if (vertices.containsKey(nombre)) {
        System.out.println("El vertice " + nombre + " existe en el grafo.");
    } else {
        System.out.println("El vertice no existe en el grafo.");
    }
  }
    public void mostrarGrafo() {
    if (vertices.isEmpty()) {
        System.out.println("El grafo esta vacio.");
    } else {
        for (String vertice : vertices.keySet()) {
            System.out.println(vertice + " -> " + vertices.get(vertice));
        }
    }
  }
    public void eliminarArista(String origen, String destino) {
    if (vertices.containsKey(origen) && vertices.containsKey(destino)) {
        if (vertices.get(origen).contains(destino)) {
            vertices.get(origen).remove(destino);
            vertices.get(destino).remove(origen);
            System.out.println("Arista eliminada correctamente.");
        } else {
            System.out.println("La arista no existe.");
        }
    } else {
        System.out.println("Uno o ambos vertices no existen.");
    }
  }
    public void eliminarVertice(String nombre) {
    if (vertices.containsKey(nombre)) {
        vertices.remove(nombre);

        for (Set<String> conexiones : vertices.values()) {
            conexiones.remove(nombre);
        }

        System.out.println("Vertice eliminado correctamente.");
    } else {
        System.out.println("El vertice no existe.");
    }
  }
}