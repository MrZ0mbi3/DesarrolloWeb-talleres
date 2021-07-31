package taller1programacionweb;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class validadores {
    validadores()
    {

    }
    public boolean validacionTitulo(String titulo)
    {
        boolean resultado=true;
        if(titulo.isEmpty())
        {
            resultado=false;
            System.out.println("Titulo vacio");
            System.out.println("No se pudo crear libro");
        }
        else if(titulo.length()<5 || titulo.length()>100)
        {
            resultado=false;
            System.out.println("Tamaño del título incorrecto ");
            System.out.println("No se pudo crear libro");
        }
        return resultado;

    }
    public boolean validacionDescripcion(String descripcion)
    {
        boolean resultado=true;
        if(descripcion.isEmpty())
        {
            resultado=false;
            System.out.println("descripción vacio");
            System.out.println("No se pudo crear libro");
        }
        else if(descripcion.length()>200)
        {
            resultado=false;
            System.out.println("Tamaño de la descripción incorrecto ");
            System.out.println("No se pudo crear libro");

        }
        return resultado;

    }
    public boolean validacionPrecio(String precio)
    {
        boolean resultado=true;
        if(precio.isEmpty())
        {
            resultado=false;
            System.out.println("precio vacio");
            System.out.println("No se pudo crear libro");
        }
        else if(precio.contains(","))
        {
            System.out.println("Precio del libro incorrecto por tener centavos ");
            System.out.println("No se pudo crear libro");
            resultado=false;
        }
        else if(!precio.chars().allMatch(Character::isDigit))
        {
            System.out.println("Precio del libro incorrecto por no ser un numero ");
            System.out.println("No se pudo crear libro");
            resultado=false;

        }
        else if  (Double.parseDouble(precio) < 10000 )
        {
            System.out.println("Precio del libro incorrecto por ser inferior a 10000 ");
            System.out.println("No se pudo crear libro");
            resultado=false;
        }
        return resultado;

    }
    public boolean validacionAutor(String nombre, String apellido)
    {
        boolean resultado=true;
        if(nombre.isEmpty() && apellido.isEmpty())
        {
            resultado=false;
            System.out.println("El nombre del autor tiene un campo vacio");
            System.out.println("No se pudo crear libro");
        }
        return resultado;

    }
    public boolean validacionpublicacion(String fecha)
    {
        boolean resultado=true;
        Date tiempo= new Date();
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate anioActual = tiempo.toInstant().atZone(timeZone).toLocalDate();
        if(fecha.isEmpty())
        {
            resultado=false;
            System.out.println("Fecha vacio");
            System.out.println("No se pudo crear libro");

        }
        else if(!fecha.chars().allMatch( Character::isDigit ))
        {
            resultado=false;
            System.out.println("El año del libro es incorrecto no es un numero");
            System.out.println("No se pudo crear libro");


        }
        else if(fecha.length()!=4 || Integer.parseInt(fecha)> anioActual.getYear() || Integer.parseInt(fecha)<0)
        {
            resultado=false;
            System.out.println("El año del libro es incorrecto");
            System.out.println("No se pudo crear libro");
        }
        return resultado;

    }
    
}
