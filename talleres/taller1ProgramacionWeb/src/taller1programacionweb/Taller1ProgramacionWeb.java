/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1programacionweb;

import java.util.Scanner;

/**
 *
 * @author samyf
 */
public class Taller1ProgramacionWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        validadores validador= new validadores();
        boolean salir=true;
        String entrada="";
        String titulo="";
        String descripcion="";
        String precio;
        String nombre="";
        String apellido="";
        String anio="";
        String aux="";
        libro nuevo;
        libreria tienda=new libreria();

        Scanner escanerEntrada= new Scanner (System.in);
        
        while(salir)
        {
            System.out.println("Tienda de libros tradicionales");
            System.out.print("\n1. Crear libro \n2. Listar libros \n3. Detallar libro \n4. Salir\nSeleccione la opción: ");
            entrada=escanerEntrada.nextLine();
            if(entrada.equals("1"))
            {

                
                    System.out.print("título del libro (mínimo 5 caracteres y máximo 100 caracteres):");
                    titulo=escanerEntrada.nextLine();
                    System.out.print("\ndescripción del libro (máximo 200 caracteres):");
                    descripcion=escanerEntrada.nextLine();
                    System.out.print("\nprecio del libro:");
                    precio=escanerEntrada.nextLine();
                    System.out.print("\nnombre del autor del libro:");
                    nombre=escanerEntrada.nextLine();
                    System.out.print("\napellido del autor del libro:");
                    apellido=escanerEntrada.nextLine();
                    System.out.print("\naño publicación del libro:");
                    anio=escanerEntrada.nextLine();
                    if(validador.validacionAutor(nombre, apellido) && validador.validacionDescripcion(descripcion) && validador.validacionPrecio(precio) && validador.validacionTitulo(titulo) && validador.validacionpublicacion(anio) )
                    {
                        aux=nombre+" "+apellido;
                        nuevo=new libro(titulo, descripcion, precio,aux , anio,"0");
                        tienda.agregarLibro(nuevo);
                    }
                
                entrada="";
            }
            else if(entrada.equals("2"))
            {
                System.out.print("\nAutor de libros a buscar:");
                entrada=escanerEntrada.nextLine();
                tienda.listarLibrosPorAutor(entrada);

                entrada="";

            }
            else if(entrada.equals("3"))
            {
                System.out.print("\nTitulo de libro a buscar:");
                entrada=escanerEntrada.nextLine();       
                tienda.detallarLibro(entrada);         
                entrada="";

            }
            else if(entrada.equals("4"))
            {
                tienda.guardarListaLibros();
                salir=false;
            }


            
        }

    }
    
}
