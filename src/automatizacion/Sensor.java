package automatizacion;

public class Sensor {
    public String nombre;
    public double lectura;
    String tipo;
    String unidad;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura + " " + unidad);
    }

    public void actualizarLectura(double nuevaLectura){
        lectura = nuevaLectura;
        System.out.println("Se ha actualizado la lectura de " + nombre + " a: " + lectura + " " + unidad);
    }

    void mostrarLectura(){
        System.out.println(nombre + ": " + lectura + unidad);
    }

    void reiniciarLectura(){
        lectura=0;
        System.out.println("Se ha reiniciadola lectura de "+ nombre + " a: "+ lectura + unidad);
    }
}
