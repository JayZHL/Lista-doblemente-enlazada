/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_6;

/**Clase que representa la estructura de dato
  @author Juan Carlos Huerta Llamas
 * version Lab Algoritmos, Fecha de inicio: 2019.21.22
 *  Fecha de finalizacion: 2019.11.19
 */
public class Lista_Doble<T> {
    Nodo<T> inicio;
    Nodo<T> fin;
    /**
     * 
     * @param inicio
     * @param fin 
     */
    public Lista_Doble(Nodo<T> inicio, Nodo<T> fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    /**
     * 
     */
    public Lista_Doble() {
    }
    /**
     * Metodo para insertar inicio
     * @param dato 
     */
    public void InsertarInicio(Square dato){
         Nodo<T> n=new Nodo();
         n.setInfo(dato);
         n.setSig(inicio);
         n.setPrev(null);
         if(inicio!=null){
             inicio.setPrev(n);
         }
         inicio=n;
     }
    
     /**
      * Metodo para insertar fin
      * @param dato 
      */
     public void InsertarFin(Square dato){
         Nodo<T> n=new Nodo();
         Nodo<T> r=new Nodo();
         n.setInfo(dato);
         n.setSig(null);
         if(inicio==null){
             n.setPrev(inicio);
             inicio=n;
         }else{
             r=inicio;
             while(r.getSig()!=null){
                 r=r.getSig();
             }
             r.setSig(n);
             n.setPrev(r);
         }
     }
     
     
     /**
      * Elimina el elemento del inicio
      */
     public void eliminaInicio(){
         if(inicio==null){
             System.out.println("Lista Vacia");
         }else{
             if(inicio.getSig()==null){
                 inicio=null;
             }else{
                 inicio=inicio.getSig();
                 inicio.setPrev(null);
             }
         }
     }     
    /**
     * Elimina el ultimo 
     */
    public void eliminaFin(){
        Nodo<T> r=null;
        Nodo<T> a=null;
        if (inicio==null){
            System.out.println("Lista Vacia");
        }else{
            if(inicio.sig==null){
                inicio=null;
            }else{
                r=inicio;
            }
            a=r;
        }
        while(r.sig!=null){
            a=r;
            r=r.sig;
        }
        a.sig=null;
}
    
    /**
     * Imprimer los elementos de la lista
     */
     public void Mostrar(){
        Nodo<T> n;
        n=inicio;
        if(inicio==null){
            System.out.println("Lista Vacia");
        }else{
            while(n!=null){
                System.out.println(n.getInfo());
                n=n.getSig();
            }
        }
    }
     /**
      * Imprime los elementos de la lista recursivamente
      * @param nodo 
      */
     public void MostrarRecursivo(Nodo<T> nodo){
        if(inicio==null){
            System.out.println("Lista Vacia");
            return;
        }else{
            
            if(nodo==null){
                return;
            }else{
                System.out.println("Dato:" + nodo.getInfo());
                MostrarRecursivo(nodo.getSig());
            }
        }
    }
     /**
      * Busca el dato y regresa y su posicion
      * @param dato
      * @return 
      */
     public int Busca3(String dato){
        boolean bandera=false;
        int num=0;
        int cont=0;
        if(inicio==null){
            System.out.println("Vacia");
            return -1;
        }else{
            Nodo<T> n=inicio;
            while(n!=null){
                if(n.getInfo().getColor().equalsIgnoreCase(dato)){
                    //String cadena=n.getInfo().toString();
                    //num= Integer.valueOf(cadena);
                    bandera=true;
                    return cont;
                }
                n=n.getSig();
                cont++;
            }
            if(!bandera){
                System.out.println("No se encontro el elemento");
                return 0;
            }else{
                 System.out.println("Se encontro el elemento");
                 return cont;
            }
            
        }
    }

    /**
     * Muetsra de x a fin
     * @param color 
     */
    public void MostraXaFin(String color){
       int cont=0;
       String mensaje;
        boolean bandera=false;
        Nodo<T> n;

    
        Nodo<T> a=inicio;
        while(a!=null){
            if(a.getInfo().getColor().equals(color)){
                bandera=true;
            }
            a=a.sig;
            cont++;
            
        }
        
        if(bandera){
            a=inicio;
            while(a!=null){
               if(a.getInfo().getColor().equals(color)){
                   a=a.sig;
                   n=a.prev;
                   while(n!=null){
                       System.out.println(n.getInfo().getColor());
                       n=n.sig;
                   }
               }
               a=a.sig;
            }
        }
        
        if(!bandera){
            System.out.println("No se encontro el color");
        }
    }
    
    /**
     * Muestra de X a inicio
     * @param color 
     */
     public void MostrarXaInicio(String color){
         boolean bandera=false;
        Nodo<T> n;

        Nodo<T> a=fin;
        while(a!=null){
            if(a.getInfo().getColor().equals(color)){
                bandera=true;
            }
            a=a.sig;

        }
        
        if(bandera){
            a=inicio;
            while(a!=null){
               if(a.getInfo().getColor().equals(color)){
                   a=a.sig;
                   n=a.prev;
                   //eliminaInicio();
                   while(n!=null){
                       System.out.println(n.getInfo().getColor());
                       n=n.prev;
                   }
               }
               a=a.sig;
            }
        }
        
        if(!bandera){
            System.out.println("No se encontro el color");
        }
        
     }
    
     /**
      * 
      * @param dato
      * @param pos 
      */
    public void InsertarenPosicion(Square dato, int pos){
        if(pos<0){
            System.out.println("Posicion invalida");
            return;
        }else{
            Nodo<T> n= new Nodo();
            n.setInfo(dato);
            if(pos==0){
                n.setSig(inicio);
                inicio=n;
                //return;
            }else{
                Nodo<T> r;
                r=inicio;
                int cont=0;
                while(cont< pos-1){
                    r=r.getSig();
                    cont++;
                }
                Nodo<T> act= r.getSig();
                n.setSig(act);
                r.setSig(n);
                
            }
        }
    }
    
     
     /**
      * Metodo para insertar un dato antes de x datp
      * @param dato
      * @param x 
      */
    public void InsertarAntes(Square dato , String x){
        Nodo<T> n=inicio;
        Nodo<T> r= new Nodo();
        Nodo<T> q= new Nodo();
        while(n.getSig()!=null && !n.getInfo().getColor().equalsIgnoreCase(x)){
            n=n.getSig();
        }
        if(n.getInfo().getColor().equalsIgnoreCase(x)){
            r.setInfo(dato);
            r.setSig(n);
            r.setPrev(n.getPrev());
            q=n.getPrev();
            n.setPrev(r);
        }
        
        if(inicio==n){
            inicio=r;
            r.setPrev(null);
        }else{
            q.setSig(r);
        }
    }
    /**
     * Inserta un dato despues de x dato
     * @param x
     * @param color
     * @return 
     */
    public boolean InsertardespuesX(String x, Square color){
        Nodo<T> prev= Busca(x);
        if(prev!=null){
            Nodo<T> n= new Nodo();
            n.setInfo(color);
            //n.sig=prev.sig;
            n.setSig(prev.getSig());
            //prev.sig=n;
            prev.setSig(n);
            return true;
        }else{
            System.out.println("No se encontro el color");
            return false;
        }
    }
    /**
     * Metodo que se utiliza para eliminar los nodos
     * @param pos 
     */
    public void eliminaPosicion(int pos){
        T dato;
        if(pos <0){
            System.out.println("Es menor a cero");
        }else{
            if(pos==0){
                Nodo<T> temp=inicio;
                inicio=inicio.getSig();
                temp.setSig(null);
            }else{
                Nodo<T> r=inicio;
                int cont=0;
                while(cont<pos-1){
                    r=r.sig;
                    cont++;
                }
                Nodo<T> act=r.sig;
                r.sig=act.sig;
                act.sig=null;
            }
        }
    }
    
    
    /**
     * Elimina el dato de la lista dado su color
     * @param color 
     */
     public void Eliminaelemento(String color){ 
        Nodo n=inicio;
        Nodo r= new Nodo();
        boolean bandera=true;
        while(!n.getInfo().getColor().equalsIgnoreCase(color) &&  bandera==true){
            if(n.getSig()!=null){
                r=n;
                n=n.getSig();
            }else{
                bandera=false;
            }
        }
        if(bandera==false){
            System.out.println("Elemento no se encuentra en la lista");
        }else{
            if(inicio==n){
                inicio=n.getSig();
            }else{
                r.sig=n.sig;
            }
        }
    }
     /**
      * Metodo que nos ayuda para el insertar despues
      * @param dato
      * @return 
      */
      public Nodo Busca(String dato){
        boolean bandera=false;
        int num=0;
        int cont=0;
        if(inicio==null){
            System.out.println("Vacia");
            return null;
        }else{
            Nodo<T> n=inicio;
            while(n!=null){
                if(n.getInfo().getColor().equals(dato)){
                    String cadena=n.getInfo().toString();
                    bandera=true;
                    return n;
                }
                n=n.getSig();
                cont++;
            }
            if(!bandera){
                System.out.println("No se encontro el elemento");
                return null;
            }else{
                 return n;
            }
            
        }
    }
    /**
     * Metodo que verifica si existe el elemento en la lista
     * @param dato
     * @return 
     */
    public boolean Busca2(String dato){
        boolean bandera=false;
        int num=0;
        int cont=0;
        if(inicio==null){
            System.out.println("Vacia");
            return false;
        }else{
            Nodo<T> n=inicio;
            while(n!=null){
                if(n.getInfo().getColor().equals(dato)){
                    String cadena=n.getInfo().toString();
                    bandera=true;
                    return true;
                }
                n=n.getSig();
                cont++;
            }
            if(!bandera){
                System.out.println("No se encontro el elemento");
                return false;
            }else{
                 return true;
            }
            
        }
    }
     
    
     /**
      * Verifica si esta vacia la lista
      * @return 
      */
     public boolean EstaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
     /**
      * Regresa el tamano de la lista
      * @return 
      */
     public int Tamano(){
        Nodo<T> n=new Nodo();
        n=inicio;
        int cont=-1;
         if(inicio==null){
            System.out.println("Lista Vacia");
            return cont;
        }else{
		while(n!=null){
                    cont++;
                    n=n.getSig();
                }
            return cont;    
        }
    }
     /**
      * 
      * @return 
      */
    public Nodo<T> getInicio() {
        return inicio;
    }
    /**
     * 
     * @param inicio 
     */
    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
     /**
      * Regresa el cuadrado en base a su posicion
      * @param pos
      * @return 
      */
     public Square ObtieneElementoPosicion(int pos){
        Square valor= new Square();
        if(pos<0){
            System.out.println("Posicion invalida");
            return null;
        }else{
            Nodo n= new Nodo();
            n=inicio;
            int cont=0;
            while(n!=null){
                if(cont==pos){
                    valor= n.getInfo();
                    
                }
                cont++;
                n=n.getSig();
            }    
            }
        return valor;
    }
   
}

