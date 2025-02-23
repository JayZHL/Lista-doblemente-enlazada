/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_6;

import javax.swing.JFrame;

/**Aqui es donde la lista se mueve graficamente
 * @author Juan Carlos Huerta Llamas
 * version Lab Algoritmos, Fecha de inicio: 2019.21.22
 * Fecha de finalizacion: 2019.11.19
 */
public class Menu<T> extends JFrame{
    Square cuadrado;
    Square cuadrado2;
    Circle circulo;
    Lista_Doble<Square> lista= new Lista_Doble();
    Lista_Doble<Square> lista2= new Lista_Doble();
    Lista_Doble<Square> listainversa= new Lista_Doble();
    Lista_Doble<Square> nodoinversa= new Lista_Doble();

    /**
     * 
     */
    public Menu() {
        circulo=new Circle(50,100,100,"negro",true);
        circulo.makeVisible();

    }
    /**
     * Inserta el primer elemento
     * @param color 
     */
    public void InsertarInicio(String color){
        if(lista.EstaVacia()){
           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);

           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);

           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
        }else{
            boolean bandera=Compruebaelemento(color);
           if(!bandera){  
           int cont=lista.Tamano();
          
           do{
              lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
              lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
               cont--;
           }while(cont>=0);

           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);
           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);

           }else{
               System.out.println("Ya existe el elemento");
           }
        }
    }
    /**
     * Inserta al final del elemento
     * @param color 
     */
    public void InsertarFinal(String color){
        boolean existe=Compruebacolores(color);
        int cont;
        if(existe){
        if(lista.EstaVacia()){
           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);
           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
           
        }else{
            boolean bandera=Compruebaelemento(color);
            if(!bandera){
                    cont=lista.Tamano();
                    cuadrado= new Square(lista.ObtieneElementoPosicion(cont).getSize(),
                        lista.ObtieneElementoPosicion(cont).getxPosition(),lista.ObtieneElementoPosicion(cont).getyPosition(),
                        color,true);
                    cuadrado2= new Square(lista2.ObtieneElementoPosicion(cont).getSize(),
                     lista2.ObtieneElementoPosicion(cont).getxPosition(),lista2.ObtieneElementoPosicion(cont).getyPosition(),
                     lista2.ObtieneElementoPosicion(cont).getColor(),true);
                    cuadrado2.slowMoveHorizontal(150);
                    cuadrado.slowMoveHorizontal(150);
                    lista.InsertarFin(cuadrado);
                    lista2.InsertarFin(cuadrado2);
  
            }else{
                System.out.println("Ya existe el elemento");
            }   
        }
        }else{
            System.out.println("No existe el color");
        }
    }
    
    /**
     * Insertar despues de un elemento x
     * @param x
     * @param color 
     */
    public void InsertardespuesX(String x, String color ){
        boolean existe=Compruebacolores(color);
        if(existe){
        if(lista.EstaVacia()){
           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);
           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
        }else{
            boolean comprueba=Compruebaelemento(color);
            boolean bandera=lista.Busca2(x);
            if(!comprueba){
            if(bandera){
                int cont=lista.Tamano();
                boolean bandera2=false;
                do{
                    if(lista.ObtieneElementoPosicion(cont).getColor().equalsIgnoreCase(x)){
                        bandera2=true;
                        cuadrado= new Square(50,lista.ObtieneElementoPosicion(cont).getxPosition(),
                                lista.ObtieneElementoPosicion(cont).getyPosition(),color,true);
                        cuadrado2= new Square(50,lista2.ObtieneElementoPosicion(cont).getxPosition(),
                                lista2.ObtieneElementoPosicion(cont).getyPosition(),"negro",true);
                        cuadrado.slowMoveHorizontal(150);
                        cuadrado2.slowMoveHorizontal(150);
                        
                        lista.InsertardespuesX(x, cuadrado);
                        lista2.InsertarenPosicion(cuadrado2, cont+1);
                        
                    }else{
                        
                        lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        
                    }
                    
                    cont--;
                }while(bandera2==false);
            }
            }else{
                System.out.println("Ya existe el elemento");
            }
        }
        }else{
            System.out.println("No existe el color");
        }
    }
    
    /**
     * Insertar un elemento antes de x elemento
     * @param x
     * @param color 
     */
    public void InsertarAntesX(String x,String color){
        boolean existe=Compruebacolores(color);
        if(existe){
            if(lista.EstaVacia()){
           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);
           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
           
           
           
        }else{
            boolean comprueba=Compruebaelemento(color);
            boolean bandera=lista.Busca2(x);
            if(!comprueba){
              if(bandera){
                  int cont=lista.Tamano();
                boolean bandera2=false;
                do{
                    if(lista.ObtieneElementoPosicion(cont).getColor().equalsIgnoreCase(x)){
                         lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        
                        bandera2=true;
                        cuadrado= new Square(50,lista.ObtieneElementoPosicion(cont).getxPosition(),
                                lista.ObtieneElementoPosicion(cont).getyPosition(),color,true);
                        cuadrado2= new Square(50,lista2.ObtieneElementoPosicion(cont).getxPosition(),
                                lista2.ObtieneElementoPosicion(cont).getyPosition(),"negro",true);
                        cuadrado.slowMoveHorizontal(-150);
                        cuadrado2.slowMoveHorizontal(-150);
                        
                        lista.InsertarAntes(cuadrado,x);
                        
                        lista2.InsertarenPosicion(cuadrado2, cont);
       
                    }else{
                        lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                    }
                    cont--;
                }while(bandera2==false);
              }
            }
            }
        }
    }
    /**
     * Elimina el primer elemento
     */
    public void EliminaPrimero(){
        if(lista.EstaVacia()){
            System.out.print("Lista Vacia");
        }else{
            lista.getInicio().getInfo().slowMoveVertical(-100);
            lista.getInicio().getInfo().erase();
            lista2.getInicio().getInfo().slowMoveVertical(-130);
            lista2.getInicio().getInfo().erase();
            lista.eliminaInicio();
            lista2.eliminaInicio();
            int cont=0;
            do{
                lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
                lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
                cont++;
            }while(cont<=lista.Tamano());
//            if(lista.Tamano()!=1){
//            }
        }
    }
    /**
     * Elimina el ultimo elemento
     */
    public void EliminaUltimo(){
        if(lista.EstaVacia()){
            System.out.print("Lista Vacia");
        }else{
            lista2.ObtieneElementoPosicion(lista2.Tamano()).slowMoveVertical(100);
            lista2.ObtieneElementoPosicion(lista2.Tamano()).erase();
            lista.ObtieneElementoPosicion(lista.Tamano()).slowMoveVertical(100);
            lista.ObtieneElementoPosicion(lista.Tamano()).erase();

            
            if(lista.Tamano()!=0){
            lista.eliminaFin();
            lista2.eliminaFin();

            }else{
                lista.eliminaInicio();
                lista2.eliminaInicio();
            }
        }
    }
    /**
     * Elimina elemento dado el color
     * @param color 
     */
    public void EliminaElemento(String color){
        if(lista.EstaVacia()){
            System.out.print("Lista Vacia");
        }else{
            boolean bandera=lista.Busca2(color);
            if(bandera){
                int cont=0;
                boolean bandera2=false;
                do{
                    if(lista.ObtieneElementoPosicion(cont).getColor().equalsIgnoreCase(color)){
                        bandera2=true;
                        lista2.ObtieneElementoPosicion(cont).slowMoveVertical(-100);
                        lista2.ObtieneElementoPosicion(cont).erase();
                        lista.ObtieneElementoPosicion(cont).slowMoveVertical(-100);
                        lista.ObtieneElementoPosicion(cont).erase();
                        lista.Eliminaelemento(color);
                        lista2.eliminaPosicion(cont);
                    }
                    if(bandera2){
                        
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
                        lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);

                    }
                    cont++;
                }while(cont<=lista.Tamano());
            }
        }
    }
    /**
     * Imprime la lista
     */
    public void Mostrar(){
        lista.Mostrar();
    }
    /**
     * Muestra la lista
     */
    public void MostrarInicioFin() throws InterruptedException{
        Lista_Doble lauxiliar= new Lista_Doble();
        Lista_Doble lauxiliar2= new Lista_Doble();
        for(int i=0; i<=lista.Tamano();i++){
             Mostrar();
            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
                    .getxPosition(),300,lista.ObtieneElementoPosicion(i).getColor(),true);
            cuadrado.makeVisible();
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
            lauxiliar.InsertarInicio(cuadrado);
            lauxiliar2.InsertarInicio(cuadrado2);
        }
        
        for(int i=0; i<=lauxiliar.Tamano();i++){
            Thread.sleep(4000);
            lauxiliar.ObtieneElementoPosicion(i).erase();
            lauxiliar2.ObtieneElementoPosicion(i).erase();
            lauxiliar.eliminaInicio();
            lauxiliar2.eliminaInicio();
        }
    }
    
    
    public void MostrarFinInicio() throws InterruptedException{
        
        for(int i=0; i<=lista.Tamano();i++){
            // Thread.sleep(2000);
            System.out.println(lista.ObtieneElementoPosicion(lista.Tamano()-i));
            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
                    .getxPosition(),300,lista.ObtieneElementoPosicion(lista.Tamano()-i).getColor(),true);
            cuadrado.makeVisible();
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
            listainversa.InsertarInicio(cuadrado);
            nodoinversa.InsertarInicio(cuadrado2);
        }
        for(int i=0; i<=listainversa.Tamano();i++){
            Thread.sleep(4000);
            listainversa.ObtieneElementoPosicion(i).erase();
            nodoinversa.ObtieneElementoPosicion(i).erase();
            listainversa.eliminaInicio();
            nodoinversa.eliminaInicio();
        }

    }
    
   /**
    * De x elemento hacia el fin de la lista
    * @param color
    * @throws InterruptedException 
    */
    public void MostrarXaFin(String color) throws InterruptedException{
        Lista_Doble lauxiliar= new Lista_Doble();
        Lista_Doble lauxiliar2= new Lista_Doble();
        int j=lista.Busca3(color);
        lista.MostraXaFin(color);
         for(int i=j; i<=lista.Tamano();i++){
             System.out.println(lista.ObtieneElementoPosicion(i));
            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
                    .getxPosition(),300,lista.ObtieneElementoPosicion(i).getColor(),true);
            cuadrado.makeVisible();
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
            lauxiliar.InsertarInicio(cuadrado);
            lauxiliar2.InsertarInicio(cuadrado2);
            }
         
         for(int i=0; i<=lauxiliar.Tamano();i++){
            Thread.sleep(4000);
            lauxiliar.ObtieneElementoPosicion(i).erase();
            lauxiliar2.ObtieneElementoPosicion(i).erase();
            lauxiliar.eliminaInicio();
            lauxiliar2.eliminaInicio();
        }
    }
    
    /**
     * Muestra la lista de X a Inicio
     * @param color
     * @throws InterruptedException 
     */
    public void MostrarXaInicio(String color) throws InterruptedException{
        Lista_Doble lauxiliar= new Lista_Doble();
        Lista_Doble lauxiliar2= new Lista_Doble();
        int j=lista.Busca3(color);
        int posx=200;
        System.out.println(j);
        lista.MostrarXaInicio(color);
        for(int i=j; i>=0;i--){
            System.out.println(lista.ObtieneElementoPosicion(i));
            cuadrado= new Square(50,posx,300,lista.ObtieneElementoPosicion(i).getColor(),true);
            cuadrado.makeVisible();
            posx+=150;
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
            lauxiliar.InsertarInicio(cuadrado);
            lauxiliar2.InsertarInicio(cuadrado2);
        }
        
        for(int i=0; i<=lauxiliar.Tamano();i++){
            Thread.sleep(4000);
            lauxiliar.ObtieneElementoPosicion(i).erase();
            lauxiliar2.ObtieneElementoPosicion(i).erase();
            lauxiliar.eliminaInicio();
            lauxiliar2.eliminaInicio();
        }
    }
    
    /**
     * Comprueba los colores validos
     * @param color
     * @return 
     */
    public boolean Compruebacolores(String color){
        if(color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("verde")
                ||color.equalsIgnoreCase("amarillo")||color.equalsIgnoreCase("azul")
            ||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("blanco")||
                color.equalsIgnoreCase("magenta")|| color.equalsIgnoreCase("naranja")
                || color.equalsIgnoreCase("rosa")||color.equalsIgnoreCase("gris")
                ||color.equalsIgnoreCase("cian")||color.equalsIgnoreCase("cafe")){
                return true;
            }else{
            return false;
        }
    }
    /**
     * Comprueba que no se repita el elemento
     * @param color
     * @return 
     */
    public boolean Compruebaelemento(String color){
        boolean bandera=false;
        for(int i=0; i<=lista.Tamano();i++){
            if(lista.ObtieneElementoPosicion(i).color.equalsIgnoreCase(color)){
                bandera=true;
            }
        }
        if(bandera){
            return true;
        }else{
            return false;
        }
    }
}
