package taller1programacionweb;

import java.io.FileWriter;
import java.io.PrintWriter;

public class libro {
    private String titulo;
    private String descripcion;
    private String precio;
    private String autor;
    private String anio;
    private String paginas;

    libro(String titulo,String descripcion, String precio, String autor, String anio, String paginas )
    {
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.autor=autor;
        this.anio=anio;
        this.paginas=paginas;
    }
    public void escribirEnLista()
    {
        FileWriter archivo=null;
        PrintWriter escritor=null; 
        try
        {
            archivo = new FileWriter("listaLibros.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(this.titulo +"," +this.descripcion+ "," + this.precio + ","+ this.autor + ","+ this.anio +"," +this.paginas);
            
            archivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTitulo()
    {
        return this.titulo;
    }
    public String getAutor()
    {
        return this.autor;
    }
    public void setPaginas(String nPaginas)
    {
        this.paginas=nPaginas;
    }
    
}
