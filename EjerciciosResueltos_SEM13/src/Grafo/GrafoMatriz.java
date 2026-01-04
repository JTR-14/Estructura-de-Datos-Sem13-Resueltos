/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GrafoMatriz<T> {

    private int[][] matrizAdyacencia;
    private ArrayList<T> vertices;
    private int capacidadMaxima;
    private boolean esDirigido;

    public GrafoMatriz(int capacidad, boolean esDirigido) {
        this.capacidadMaxima = capacidad;
        this.esDirigido = esDirigido;
        this.matrizAdyacencia = new int[capacidad][capacidad];
        this.vertices = new ArrayList<>();
    }

    private int buscarIndice(T vertice) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).equals(vertice)) {
                return i;
            }
        }
        return -1;
    }

    public void agregarVertice(T vertice) {
        if (vertices.size() < capacidadMaxima) {
            if (buscarIndice(vertice) == -1) {
                vertices.add(vertice);
            }
        }
    }

    public void agregarArista(T origen, T destino, int peso) {
        int i = buscarIndice(origen);
        int j = buscarIndice(destino);

        if (i != -1 && j != -1) {
            matrizAdyacencia[i][j] = peso;

            if (!esDirigido) {
                matrizAdyacencia[j][i] = peso;
            }
        }
    }

    public String obtenerMatrizTexto() {
        String texto = "Matriz de Adyacencia:\n";

        texto += String.format("%15s", " ");

        for (T v : vertices) {
            texto += String.format("%15s", v.toString());
        }
        texto += "\n";

        for (int i = 0; i < vertices.size(); i++) {
            texto += String.format("%-15s", vertices.get(i));

            for (int j = 0; j < vertices.size(); j++) {
                int valor = matrizAdyacencia[i][j];
                String celda = (valor == 0) ? "-" : String.valueOf(valor);
                texto += String.format("%15s", celda);
            }
            texto += "\n";
        }
        return texto;
    }

    public String bfsTexto(T inicio) {
        int indiceInicio = buscarIndice(inicio);
        if (indiceInicio == -1) {
            return "Vértice no existe";
        }

        String resultado = "Recorrido BFS desde " + inicio + ":\n";
        boolean[] visitado = new boolean[capacidadMaxima];
        Queue<Integer> cola = new LinkedList<>();

        visitado[indiceInicio] = true;
        cola.add(indiceInicio);

        while (!cola.isEmpty()) {
            int indiceActual = cola.poll();
            resultado += vertices.get(indiceActual) + " -> ";

            for (int i = 0; i < vertices.size(); i++) {
                if (matrizAdyacencia[indiceActual][i] > 0 && !visitado[i]) {
                    visitado[i] = true;
                    cola.add(i);
                }
            }
        }
        resultado += "FIN";
        return resultado;
    }

    public String dfsTexto(T inicio) {
        int indiceInicio = buscarIndice(inicio);
        if (indiceInicio == -1) {
            return "Vértice no existe";
        }

        String resultado = "Recorrido DFS desde " + inicio + ":\n";
        boolean[] visitado = new boolean[capacidadMaxima];
        List<String> recorrido = new ArrayList<>();

        dfsRecursivo(indiceInicio, visitado, recorrido);

        for (String s : recorrido) {
            resultado += s + " -> ";
        }
        resultado += "FIN";
        return resultado;
    }

    private void dfsRecursivo(int indiceActual, boolean[] visitado, List<String> recorrido) {
        visitado[indiceActual] = true;
        recorrido.add(vertices.get(indiceActual).toString());

        for (int i = 0; i < vertices.size(); i++) {
            if (matrizAdyacencia[indiceActual][i] > 0 && !visitado[i]) {
                dfsRecursivo(i, visitado, recorrido);
            }
        }
    }

    public ArrayList<T> obtenerVertices() {
        return vertices;
    }
}
