/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GrafoLista<T> {
    private List<Nodo<T>> nodos;
    private boolean esDirigido;

    public GrafoLista(boolean esDirigido) {
        this.nodos = new ArrayList<>();
        this.esDirigido = esDirigido;
    }

    private Nodo<T> buscarNodo(T dato) {
        for (Nodo<T> n : nodos) {
            if (n.getDato().equals(dato)) {
                return n;
            }
        }
        return null; 
    }
    
    public void llenarCombo(T dato){
        Nodo<T>  nodo = buscarNodo(dato);
        
    }
    public void agregarVertice(T dato) {
        if (buscarNodo(dato) == null) {
            nodos.add(new Nodo<>(dato));  
        }
    }

    public void agregarArista(T origen, T destino) {
        agregarVertice(origen);
        agregarVertice(destino);

        Nodo<T> nodoOrigen = buscarNodo(origen);
        Nodo<T> nodoDestino = buscarNodo(destino);

        if (nodoOrigen != null && nodoDestino != null) {
            nodoOrigen.agregarVecino(nodoDestino);
            if (!esDirigido) {
                nodoDestino.agregarVecino(nodoOrigen);
            }
        }
    }

    public String obtenerGrafoTexto() {
        String texto = "";
        
        for (Nodo<T> n : nodos) {
            texto += n.getDato() + " es amigo de: [ ";
            for (Nodo<T> vecino : n.getVecinos()) {
                texto += vecino.getDato() + " ";
            }
            texto += "]\n";
        }
        return texto;
    }

    public String bfsTexto(T inicio) {
        Nodo<T> nodoInicio = buscarNodo(inicio);
        if (nodoInicio == null) return "El estudiante no existe.";

        String resultado = "Recorrido BFS (Niveles) desde " + inicio + ":\n";
        
        List<Nodo<T>> visitados = new ArrayList<>();
        Queue<Nodo<T>> cola = new LinkedList<>();

        visitados.add(nodoInicio);
        cola.add(nodoInicio);

        while (!cola.isEmpty()) {
            Nodo<T> actual = cola.poll();
            resultado += actual.getDato() + " -> ";

            for (Nodo<T> vecino : actual.getVecinos()) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }
        resultado += "FIN";
        return resultado;
    }

    public String dfsTexto(T inicio) {
        Nodo<T> nodoInicio = buscarNodo(inicio);
        if (nodoInicio == null) return "El estudiante no existe.";

        List<Nodo<T>> ordenVisita = new ArrayList<>();
        dfsRecursivo(nodoInicio, ordenVisita);

        String resultado = "Recorrido DFS (Comunidad) desde " + inicio + ":\n";
        for (Nodo<T> n : ordenVisita) {
            resultado += n.getDato() + " -> ";
        }
        resultado += "FIN";
        
        return resultado;
    }

    private void dfsRecursivo(Nodo<T> actual, List<Nodo<T>> visitados) {
        visitados.add(actual);
        
        for (Nodo<T> vecino : actual.getVecinos()) {
            if (!visitados.contains(vecino)) {
                dfsRecursivo(vecino, visitados);
            }
        }
    }
    public ArrayList<T> obtenerListaNodos(){
        ArrayList<T> lista = new ArrayList<>();
        for(Nodo<T> nodo : nodos){
          lista.add(nodo.getDato());
        }
        return lista;
    }
}
