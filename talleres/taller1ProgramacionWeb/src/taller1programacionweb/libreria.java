package taller1programacionweb;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class libreria {
    private List<libro> libros=new ArrayList<libro>(); 
    libreria()
    {
        

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
    
}
