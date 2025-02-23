/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_6;

/**
 *  El nodo de la lista
 * @author Juan Carlos Huerta Llamas
 * version Lab Algoritmos, Fecha de inicio: 2019.21.22
 *  Fecha de finalizacion: 2019.11.19
 */
public class Nodo<T> {
    Square info;
    Nodo<T> sig;
    Nodo<T> prev;

    public Nodo(Square info, Nodo<T> sig, Nodo<T> prev) {
        this.info = info;
        this.sig = sig;
        this.prev = prev;
    }

 

    public Nodo() {
    }

    public Square getInfo() {
        return info;
    }

    public void setInfo(Square info) {
        this.info = info;
    }

    

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public Nodo<T> getPrev() {
        return prev;
    }

    public void setPrev(Nodo<T> prev) {
        this.prev = prev;
    }


}

