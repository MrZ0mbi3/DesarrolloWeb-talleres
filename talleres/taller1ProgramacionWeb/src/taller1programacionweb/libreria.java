package taller1programacionweb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class libreria {
    private List<libro> libros=new ArrayList<libro>(); 
    libreria()
    {
        libro n;
        String linea;
        String aux[];
        try {
            FileReader archivo= new FileReader("listaLibros.txt");
            BufferedReader lector= new BufferedReader(archivo);
            while((linea=lector.readLine())!=null)
            {
                aux=linea.split("--");
                n=new libro(aux[0], aux[1], aux[2], aux[3], aux[4],aux[5]);
                libros.add(n);
            }
            archivo.close();
            System.out.println("cantidad de libros " + libros.size());

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    
    public void agregarLibro(libro nuevo)
    {
        libros.add(nuevo);
        System.out.println("libros ahora en la libreria: " + libros.size());

    }

    public void guardarListaLibros()
    {
        FileWriter archivo=null;
        PrintWriter escritor=null; 
        try
        {
            archivo = new FileWriter("listaLibros.txt");
            escritor = new PrintWriter(archivo);

            for(libro n: libros)
            {
                n.escribirEnLista();
            }
            
            
            archivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarLibrosPorAutor(String nAutor)
    {
        for(libro lib : libros)
        {
            if(lib.getAutor().contains(nAutor))
            {
                System.out.println("Libro: " + lib.getTitulo() +"  Autor: " + lib.getAutor());
            }
        }
    }

    public void detallarLibro(String nTitulo)
    {
        for (libro lib : libros) 
        {
            lib.detallarlibro(nTitulo);
        }   
    }
    
}
