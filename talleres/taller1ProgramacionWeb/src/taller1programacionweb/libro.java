package taller1programacionweb;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

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
            escritor.println(this.titulo +"--" +this.descripcion+ "--" + this.precio + "--"+ this.autor + "--"+ this.anio +"--" +this.paginas);
            
            archivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void detallarlibro(String nTitulo)
    {
        Scanner escanerEntrada= new Scanner (System.in);
        String entrada="";
        validadores validador=new validadores();
        if(this.titulo.equals(nTitulo))
        {
            System.out.print("\nTitulo: "+this.titulo +"\nDescripción: "+this.descripcion +"\nPrecio: "+this.precio+"\nAño de publicación: "+this.anio + "\nIngrese el numero de páginas (no superior a 1500 página): " );
            entrada=escanerEntrada.nextLine();
            if(validador.validacionPaginas(entrada))
            {
                this.paginas=entrada;
                System.out.println("Se datallo libro");
            }
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
