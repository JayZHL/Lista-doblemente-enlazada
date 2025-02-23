/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_6;

/**
 *
 * @author PC
 */
public class Nodo2<T> {
     T info;
    Nodo2<T> sig;
    Nodo2<T> prev;

    public Nodo2(T info, Nodo2<T> sig, Nodo2<T> prev) {
        this.info = info;
        this.sig = sig;
        this.prev = prev;
    }

    public Nodo2() {
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo2<T> getSig() {
        return sig;
    }

    public void setSig(Nodo2<T> sig) {
        this.sig = sig;
    }

    public Nodo2<T> getPrev() {
        return prev;
    }

    public void setPrev(Nodo2<T> prev) {
        this.prev = prev;
    }
    
    


    
    
}
