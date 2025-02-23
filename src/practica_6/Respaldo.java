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
public class Respaldo {
    Square cuadrado;
    Square cuadrado2;
    Rectangulo rectangulo;
    Rectangulo rectangulo2;
    Circle circulo;
    Lista_Doble<Square> lista= new Lista_Doble();
    Lista_Doble<Square> lista2= new Lista_Doble();
    Lista_Doble<Square> listainversa= new Lista_Doble();
//    ArrayList<Rectangulo> lista3=new ArrayList();
//     ArrayList<Rectangulo> lista4=new ArrayList();
    /**
     * 
     */
    public Respaldo() {
        circulo=new Circle(50,100,100,"negro",true);
        circulo.makeVisible();
//        rectangulo=new Rectangulo(50,10,150,120,"negro",true);
//        rectangulo.makeVisible();
    }
    /**
     * 
     * @param color 
     */
    public void InsertarInicio(String color){
        if(lista.EstaVacia()){
           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);
//           rectangulo= new Rectangulo(50,10,150,110,"negro",true);
//           rectangulo.makeVisible();
//           rectangulo2= new Rectangulo(50,10,150,130,"negro",true);
//           rectangulo2.makeVisible();
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
//           lista3.add(0,rectangulo);
//           lista4.add(0,rectangulo2);
           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
        }else{
            boolean bandera=Compruebaelemento(color);
           if(!bandera){  
           int cont=lista.Tamano();
          
           do{
              lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
              lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
//              lista3.get(cont).slowMoveHorizontal(150);
//              lista4.get(cont).slowMoveHorizontal(150);
//              lista3.get(cont).setColor(lista.ObtieneElementoPosicion(cont).getColor());
//              lista4.get(cont).setColor(lista.ObtieneElementoPosicion(cont).getColor());
              
              
              
//              rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont).getxPosition()-40,110,
//                      lista.ObtieneElementoPosicion(cont).getColor(),true);
//              rectangulo.makeVisible();
//              rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont).getxPosition()-40,130,
//                      lista.ObtieneElementoPosicion(cont).getColor(),true);
//              lista3.addFirst(rectangulo);
//              lista4.addFirst(rectangulo2);
              //rectangulo2.makeVisible();
               cont--;
           }while(cont>=0);
//           rectangulo= new Rectangulo(50,10,150,110,"negro",true);
//           rectangulo.makeVisible();
//           rectangulo2= new Rectangulo(50,10,150,130,"negro",true);
//           rectangulo2.makeVisible();
           cuadrado= new Square(50,100,100,color,true);
           cuadrado2=new Square(50,130,100,"negro",true);
           cuadrado2.slowMoveHorizontal(130);
           cuadrado.slowMoveHorizontal(100);
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
//           lista3.add(0,rectangulo);
//           lista4.add(0,rectangulo2);
           }else{
               System.out.println("Ya existe el elemento");
           }
        }
    }
    /**
     * 
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
//           rectangulo= new Rectangulo(50,10,150,110,"negro",true);
//           rectangulo.makeVisible();
//           rectangulo2= new Rectangulo(50,10,150,130,"negro",true);
//           rectangulo2.makeVisible();
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
//           lista3.add(0,rectangulo);
//           lista4.add(0,rectangulo2);
           
        }else{
            boolean bandera=Compruebaelemento(color);
            if(!bandera){
//             if(lista.Tamano()==1){
//             cont=lista.Tamano();
//             cuadrado= new Square(lista.ObtieneElementoPosicion(cont).getSize(),
//                     lista.ObtieneElementoPosicion(cont).getxPosition(),lista.ObtieneElementoPosicion(cont).getyPosition(),
//                     color,true);
//             cuadrado2= new Square(lista2.ObtieneElementoPosicion(cont).getSize(),
//                     lista2.ObtieneElementoPosicion(cont).getxPosition(),lista2.ObtieneElementoPosicion(cont).getyPosition(),
//                     lista2.ObtieneElementoPosicion(cont).getColor(),true);
//            cuadrado2.slowMoveHorizontal(150);
//           cuadrado.slowMoveHorizontal(150);
//           rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(lista.Tamano()).getxPosition()-40,110,
//                      color,true);
//              rectangulo.makeVisible();
//              rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(lista.Tamano()).getxPosition()-40,130,
//                      color,true);
//              rectangulo2.makeVisible();
//              System.out.println("Hola");
//           lista.InsertarFin(cuadrado);
//           lista2.InsertarFin(cuadrado2);
//             }else{
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
//                    rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(lista.Tamano()).getxPosition()-40,110,
//                      color,true);
//                    rectangulo.makeVisible();
//                    rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(lista.Tamano()).getxPosition()-40,130,
//                      color,true);
//                    rectangulo2.makeVisible();
//                    lista3.add(lista3.size(),rectangulo);
//                    lista4.add(lista4.size(),rectangulo2);
  
            }else{
                System.out.println("Ya existe el elemento");
            }   
        }
        }else{
            System.out.println("No existe el color");
        }
    }
    
    /**
     * 
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
//           rectangulo= new Rectangulo(50,10,150,110,"negro",true);
//           rectangulo.makeVisible();
//           rectangulo2= new Rectangulo(50,10,150,130,"negro",true);
//           rectangulo2.makeVisible();
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
//           lista3.add(0,rectangulo);
//           lista4.add(0,rectangulo2);
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
                        
//                       rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont+1).getxPosition()-40,110,
//                      color,true);
//                       rectangulo.makeVisible();
//                        rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont+1).getxPosition()-40,130,
//                      color,true);
//                        rectangulo2.makeVisible();
                        
         
//                        lista.InsertardespuesX(x, cuadrado);
//                        lista2.InsertarenPosicion(cuadrado2, cont+1);
       
//                        rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(lista.Tamano()-cont).getxPosition()-40,110,
//                      color,true);
//                        rectangulo.makeVisible();
//                        rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(lista.Tamano()-cont).getxPosition()-40,130,
//                      color,true);
//                        rectangulo2.makeVisible();
                        
//                        lista3.add(cont, rectangulo);
//                        lista4.add(cont, rectangulo2);
                    }else{
                        
                        lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        
                        
//                        lista3.get(cont).moveHorizontal(150);
//                        lista4.get(cont).moveHorizontal(150);
                        
                        //rectangulo.slowMoveHorizontal(40);
//                        rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont).getxPosition()-40,110,
//                      lista.ObtieneElementoPosicion(cont).getColor(),true);
//                        rectangulo.makeVisible();
//                        rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont).getxPosition()-40,130,
//                      lista.ObtieneElementoPosicion(cont).getColor(),true);
//                        rectangulo2.makeVisible();
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
     * 
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
//           rectangulo= new Rectangulo(50,10,150,110,"negro",true);
//           rectangulo.makeVisible();
//           rectangulo2= new Rectangulo(50,10,150,130,"negro",true);
//           rectangulo2.makeVisible();
           lista.InsertarInicio(cuadrado);
           lista2.InsertarInicio(cuadrado2);
           
//           lista3.add(0,rectangulo);
//           lista4.add(0,rectangulo2);
           
           
        }else{
            boolean comprueba=Compruebaelemento(color);
            boolean bandera=lista.Busca2(x);
            if(!comprueba){
              if(bandera){
                  int cont=lista.Tamano();
                boolean bandera2=false;
                do{
                    if(lista.ObtieneElementoPosicion(cont).getColor().equalsIgnoreCase(x)){
                        //System.out.println(cont);
                        //if(cont==0){
                         lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
//                        lista3.get(cont).moveHorizontal(150);
//                        lista4.get(cont).moveHorizontal(150);
//                        lista3.get(cont).setColor(lista.ObtieneElementoPosicion(cont).getColor());
//                        lista4.get(cont).setColor(lista.ObtieneElementoPosicion(cont).getColor());
//                        bandera2=true;
//                        cuadrado= new Square(50,lista.ObtieneElementoPosicion(cont).getxPosition(),
//                                lista.ObtieneElementoPosicion(cont).getyPosition(),color,true);
//                        cuadrado2= new Square(50,lista2.ObtieneElementoPosicion(cont).getxPosition(),
//                                lista2.ObtieneElementoPosicion(cont).getyPosition(),"negro",true);
//                        cuadrado.slowMoveHorizontal(-150);
//                        cuadrado2.slowMoveHorizontal(-150);
//                        System.out.println("Entro");
//                        lista.InsertarAntes(cuadrado,x);
//                        lista2.InsertarenPosicion(cuadrado2, cont-1);
//                        rectangulo= new Rectangulo(50,10,150,110,"negro",true);
//                        rectangulo.makeVisible();
//                        rectangulo2= new Rectangulo(50,10,150,130,"negro",true);
//                        rectangulo2.makeVisible();
//                        lista3.add(cont, rectangulo);
//                        lista4.add(cont, rectangulo2);
                        //else{
//                         lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
//                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
//                        lista3.get(cont).moveHorizontal(150);
//                        lista4.get(cont).moveHorizontal(150);
                        
                        bandera2=true;
                        cuadrado= new Square(50,lista.ObtieneElementoPosicion(cont).getxPosition(),
                                lista.ObtieneElementoPosicion(cont).getyPosition(),color,true);
                        cuadrado2= new Square(50,lista2.ObtieneElementoPosicion(cont).getxPosition(),
                                lista2.ObtieneElementoPosicion(cont).getyPosition(),"negro",true);
                        cuadrado.slowMoveHorizontal(-150);
                        cuadrado2.slowMoveHorizontal(-150);
                        
                        lista.InsertarAntes(cuadrado,x);
                        
                        lista2.InsertarenPosicion(cuadrado2, cont);
       
//                        rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont).getxPosition()-40,110,
//                      color,true);
//                        rectangulo.makeVisible();
//                        rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(cont).getxPosition()-40,130,
//                      color,true);
//                        rectangulo2.makeVisible();
                        
//                        lista3.add(cont, rectangulo);
//                        lista4.add(cont, rectangulo2);
                        //}
                    }else{
                        lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(150);
//                        lista3.get(cont).moveHorizontal(150);
//                        lista4.get(cont).moveHorizontal(150);
                        //System.out.println(cont);
                    }
                    cont--;
                }while(bandera2==false);
              }
            }
            }
        }
    }
    /**
     * 
     */
    public void EliminaPrimero(){
        if(lista.EstaVacia()){
            System.out.print("Lista Vacia");
        }else{
            lista.getInicio().getInfo().slowMoveVertical(-100);
            lista.getInicio().getInfo().erase();
            lista2.getInicio().getInfo().slowMoveVertical(-130);
            lista2.getInicio().getInfo().erase();
//            lista.eliminaInicio();
//            lista2.eliminaInicio();
            if(lista.Tamano()!=1){
//                lista3.get(1).erase();
//                lista4.get(1).erase();
//                lista3.remove(1);
//                lista4.remove(1);
            
//            lista3.get(0).setColor(lista.getInicio().getInfo().getColor());
//            lista4.get(0).setColor(lista.getInicio().getInfo().getColor());
//            lista3.get(0).moveHorizontal(-150);
//            lista4.get(0).moveHorizontal(-150);
//             int cont=lista.Tamano();
//             
//            do{
//                lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
//                lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
//                if(cont!=0){
//                    
////                lista3.get(cont).moveHorizontal(-150);
////                lista4.get(cont).moveHorizontal(-150);
//                }
//                cont--;
//            }while(cont>=0);
            }
        }
    }
    /**
     * 
     */
    public void EliminaUltimo(){
        if(lista.EstaVacia()){
            System.out.print("Lista Vacia");
        }else{
            lista2.ObtieneElementoPosicion(lista2.Tamano()).slowMoveVertical(100);
            lista2.ObtieneElementoPosicion(lista2.Tamano()).erase();
            lista.ObtieneElementoPosicion(lista.Tamano()).slowMoveVertical(100);
            lista.ObtieneElementoPosicion(lista.Tamano()).erase();
//            lista3.get(lista3.size()-1).erase();
//            lista4.get(lista4.size()-1).erase();
            if(lista.Tamano()!=0){
//            lista.eliminaFin3();
//            lista2.eliminaFin3();
//            lista3.remove(lista3.size()-1);
//            lista4.remove(lista4.size()-1);
            }else{
//                lista.eliminaInicio();
//                lista2.eliminaInicio();
            }
        }
    }
    /**
     * 
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
//                        lista3.get(cont).erase();
//                        lista4.get(cont).erase();
                        lista.Eliminaelemento(color);
                        lista2.eliminaPosicion(cont);
//                        lista3.remove(cont);
//                        lista4.remove(cont);
                    }
                    if(bandera2){
                        
                        lista.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
                        lista2.ObtieneElementoPosicion(cont).slowMoveHorizontal(-150);
//                        lista3.get(cont).moveHorizontal(-150);
//                        lista4.get(cont).moveHorizontal(-150);
                    }
                    cont++;
                }while(cont<=lista.Tamano());
            }
        }
    }
    /**
     * 
     */
    public void Mostrar(){
        lista.Mostrar();
    }
    /**
     * 
     */
    public void MostrarInicioFin(){
        for(int i=0; i<=lista.Tamano();i++){
            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
                    .getxPosition(),300,lista.ObtieneElementoPosicion(i).getColor(),true);
            cuadrado.makeVisible();
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
 
//            rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(i).getxPosition()-40,310,
//                      lista.ObtieneElementoPosicion(i).getColor(),true);
//            rectangulo.makeVisible();
//            rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(i).getxPosition()-40,330,
//                      lista.ObtieneElementoPosicion(i).getColor(),true);
//           rectangulo2.makeVisible();

        }
    }
    
    public void MostrarFinInicio() throws InterruptedException{
        int posx=200;
        listainversa=lista;
       // listainversa=listainversa.Inversa(listainversa);
        for(int i=0; i<=listainversa.Tamano();i++){
            System.out.println(listainversa.ObtieneElementoPosicion(i).getColor());
            cuadrado= new Square(50,posx,300,listainversa.ObtieneElementoPosicion(i).getColor(),true);
            cuadrado.makeVisible();
            posx+=150;
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
//            if(i>=1){
//            rectangulo= new Rectangulo(50,10,posx-40,310,
//                      listainversa.ObtieneElementoPosicion(i).getColor(),true);
//            rectangulo.makeVisible();
//            rectangulo2= new Rectangulo(50,10,posx-40,330,
//                      listainversa.ObtieneElementoPosicion(i).getColor(),true);
//           rectangulo2.makeVisible();
//            }
           //posx+=150;
        }
        Thread.sleep(2000);
        for(int i=0; i<=listainversa.Tamano();i++){
            cuadrado.erase();
            cuadrado2.erase();
        }
    }
    
    public void MostrarFinInicio2() throws InterruptedException{
        
        for(int i=0; i<=lista.Tamano();i++){
            // Thread.sleep(2000);
            System.out.println(lista.ObtieneElementoPosicion(lista.Tamano()-i));
            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
                    .getxPosition(),300,lista.ObtieneElementoPosicion(lista.Tamano()-i).getColor(),true);
            cuadrado.makeVisible();
            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
            cuadrado2.makeVisible();
//            rectangulo= new Rectangulo(50,10,lista.ObtieneElementoPosicion(i).getxPosition()-40,310,
//                      lista.ObtieneElementoPosicion(i).getColor(),true);
//            rectangulo.makeVisible();
//            rectangulo2= new Rectangulo(50,10,lista.ObtieneElementoPosicion(i).getxPosition()-40,330,
//                      lista.ObtieneElementoPosicion(i).getColor(),true);
//           rectangulo2.makeVisible();
            listainversa.InsertarInicio(cuadrado);
        }
        for(int i=0; i<=listainversa.Tamano();i++){
            Thread.sleep(2000);
            listainversa.ObtieneElementoPosicion(i).erase();
            
        }
    }
    
//    public void MostrarXaFin(String color){
//        boolean bandera=Compruebaelemento(color);
//        if(!bandera){
//         boolean bandera2=lista.Busca2(color);
//            if(bandera2){    
//        //int posx=200;
//        Lista_Doble<Square> lx= new Lista_Doble();
//        lx=lista;
//        int j=lx.MostraXaFin(lx,color);
//        for(int i=j; i<=lx.Tamano();i++){
//            System.out.println(lista.ObtieneElementoPosicion(i));
//            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
//                    .getxPosition(),300,lista.ObtieneElementoPosicion(lista.Tamano()-i).getColor(),true);
//            cuadrado.makeVisible();
//            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
//            cuadrado2.makeVisible();
////            if(i>=1){
////            rectangulo= new Rectangulo(50,10,posx-40,310,
////                      lx.ObtieneElementoPosicion(i).getColor(),true);
////            rectangulo.makeVisible();
////            rectangulo2= new Rectangulo(50,10,posx-40,330,
////                      lx.ObtieneElementoPosicion(i).getColor(),true);
////           rectangulo2.makeVisible();
////            }
//            }
//            }else{
//                System.out.println("No se encontro");
//            }
//        }else{
//            System.out.println("No existe el color");
//        }
//    }
//    public void MostrarXaFin2(String color){
//        int j=lista.Busca3(color);
//        System.out.println(j);
//         for(int i=j; i>=lista.Tamano();i++){
//            System.out.println(lista.ObtieneElementoPosicion(i));
//            cuadrado= new Square(50,lista.ObtieneElementoPosicion(i)
//                    .getxPosition(),300,lista.ObtieneElementoPosicion(i).getColor(),true);
//            cuadrado.makeVisible();
//            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
//            cuadrado2.makeVisible();
////            if(i>=1){
////            rectangulo= new Rectangulo(50,10,posx-40,310,
////                      lx.ObtieneElementoPosicion(i).getColor(),true);
////            rectangulo.makeVisible();
////            rectangulo2= new Rectangulo(50,10,posx-40,330,
////                      lx.ObtieneElementoPosicion(i).getColor(),true);
////           rectangulo2.makeVisible();
////            }
//            }
//    }
//    public void MostrarXaInicio(String color){
//        int j=lista.Busca3(color);
//        int posx=200;
//        System.out.println(j);
//        for(int i=j; i>=0;i--){
//            System.out.println(lista.ObtieneElementoPosicion(i));
//            cuadrado= new Square(50,posx,300,lista.ObtieneElementoPosicion(i).getColor(),true);
//            cuadrado.makeVisible();
//            posx+=150;
//            cuadrado2=new Square(50,lista2.ObtieneElementoPosicion(i).getxPosition(),300,"negro",true);
//            cuadrado2.makeVisible();
//        }
//    }
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
