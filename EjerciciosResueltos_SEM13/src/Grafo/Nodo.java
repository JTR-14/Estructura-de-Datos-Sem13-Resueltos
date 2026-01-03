/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import java.util.ArrayList;
import java.util.List;

public class Nodo<T> {

    private T dato;
    private List<Nodo<T>> vecinos; 

    public Nodo(T dato) {
        this.dato = dato;
        this.vecinos = new ArrayList<>();
    }

    public T getDato() {
        return dato;
    }

    public List<Nodo<T>> getVecinos() {
        return vecinos;
    }

    public void agregarVecino(Nodo<T> vecino) {
        
        if (!vecinos.contains(vecino)) {
            vecinos.add(vecino);
        }
    }
    
    public void eliminarVecino(Nodo<T> vecino){
        vecinos.remove(vecino);
    }
    @Override
    public String toString() {
        return dato.toString();
    }

}
