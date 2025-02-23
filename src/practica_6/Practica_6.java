/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_6;

    import java.util.Scanner;

    /**Clase Principal para nuestro de programa de listas dobles
     *@author Juan Carlos Huerta Llamas
     * version Lab Algoritmos, Fecha de inicio: 2019.21.22
     * Fecha de finalizacion: 2019.11.19
     */
    public class Practica_6 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) throws InterruptedException {
            // TODO code application logic here
            Menu menu= new Menu();
            char op;
            int op2;
            String elemento,color;
            Scanner scanner= new Scanner(System.in);
            Scanner scannerletras = new Scanner(System.in);
            Scanner scannerletras2= new Scanner(System.in);
             Scanner scannern= new Scanner(System.in);
            do{
                System.out.println("a. Insertar de un elemento nuevo antes ó después de uno existente (El\n" +
                "usuario captura desde el teclado el nuevo elemento a insertar, así como\n" +
                "el elemento anterior ó después del que lo insertará).");
                System.out.println("b. Insertar un nuevo elemento al inicio");
                System.out.println("c. Insertar un nuevo elemento al final");
                System.out.println("d. Eliminar un elemento que el usuario captura desde el teclado");
                System.out.println("e. Eliminar el primer elemento");
                System.out.println("f. Eliminar el último elemento");
                System.out.println("g. Mostrar el contenido de la lista de inicio a fin");
                System.out.println("h. Mostrar el contenido de la lista de fin a inicio.");
                System.out.println("i. Mostrar el contenido de la lista a partir de un elemento que el usuario\n" +
                "captura desde el teclado, hasta el fin de la lista.");
                System.out.println("j.Mostrar el contenido de la lista a partir de un elemento que el usuario\n" +
                "captura desde el teclado, hasta el inicio de la lista.");
                System.out.println("k. Salir");

                op=scanner.next().charAt(0);
                switch(op){
                    case 'a':
                        System.out.println("1) Despues ");
                        System.out.println("2) Antes ");
                        op2=scannern.nextInt();
                        switch(op2){
                            case 1:
                                System.out.println("Ingrese el color a insertar despues: ");
                                elemento=scannerletras.nextLine();
                                System.out.println("Ingrese el color nuevo: ");
                                color=scannerletras2.nextLine();
                                menu.InsertardespuesX(elemento, color);
                                break;
                            case 2:
                                System.out.println("Ingrese el color a insertar antes: ");
                                elemento=scannerletras.nextLine();
                                System.out.println("Ingrese el color nuevo: ");
                                color=scannerletras2.nextLine();
                                menu.InsertarAntesX(elemento, color);
                                break;
                            default:
                                System.out.println("Opcion invalida ");
                                break;
                        }
                        break;
                    case 'b':
                        System.out.println("Ingrese el color nuevo: ");
                        color=scannerletras.nextLine();
                        menu.InsertarInicio(color);
                        break;
                    case 'c':
                        System.out.println("Ingrese el color nuevo: ");
                        color=scannerletras.nextLine();
                        menu.InsertarFinal(color);
                        break;
                    case 'd':
                        System.out.println("Ingrese el color a eliminar: ");
                        color=scannerletras.nextLine();
                        menu.EliminaElemento(color);
                        break;
                    case 'e':
                        System.out.println("Eliminando primero: ");
                        menu.EliminaPrimero();
                        break;
                    case 'f':
                        System.out.println("Eliminando ultimo: ");
                        menu.EliminaUltimo();
                        break;
                    case 'g':
                        System.out.println("Mostrando Inicio a fin: ");
                        menu.MostrarInicioFin();
                        break;
                    case 'h':
                        System.out.println("Mostrando Fin a Inicio: ");
                        menu.MostrarFinInicio();
                        break;
                    case 'i':
                        System.out.println("Ingrese el color: ");
                        color=scannerletras.nextLine();
                        menu.MostrarXaFin(color);
                        break;
                    case 'j':
                        System.out.println("Ingrese el color: ");
                        color=scannerletras.nextLine();
                        menu.MostrarXaInicio(color);
                        break;
                    case 'k':
                         System.out.println("Saliendo");
                         System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            }while(op!='k');

        }

    }
