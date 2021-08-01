package taller1programacionweb;

import java.io.FileWriter;
import java.io.PrintWriter;

public class libro {
    private String titulo;
    private String descripcion;
    private String precio;
    private String autor;
    private String anio;

    libro(String titulo,String descripcion, String precio, String autor, String anio)
    {
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.autor=autor;
        this.anio=anio;
    }
    public void escribirEnLista()
    {
        FileWriter archivo=null;
        PrintWriter escritor=null; 
        try
        {
            archivo = new FileWriter("listaLibros.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(this.titulo +"," +this.descripcion+ "," + this.precio + ","+ this.autor + ","+ this.anio);
            
            archivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
