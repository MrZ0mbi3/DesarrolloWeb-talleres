package taller1programacionweb;

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
    
}
