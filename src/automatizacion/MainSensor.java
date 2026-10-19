package automatizacion;

public class MainSensor {
    public static void main(String[] args) {
        Sensor temperatura = new Sensor();
        temperatura.nombre = "Sensor de Temperatura";
        temperatura.tipo = "Temperatura";
        temperatura.lectura = 19.7;
        temperatura.unidad = "°C";

        Sensor presion = new Sensor();
        presion.nombre = "Sensor de Presion";
        presion.tipo = "Presion";
        presion.lectura = 167.3;
        presion.unidad = "kPa";

        Sensor humedad = new Sensor();
        humedad.nombre = "Sensor de Humedad";
        humedad.tipo = "Humedad";
        humedad.lectura = 58;
        humedad.unidad = "%";

        temperatura.mostrarInformacion();
        temperatura.actualizarLectura(17.2);
        temperatura.mostrarLectura();

        presion.mostrarInformacion();
        presion.reiniciarLectura();
        presion.mostrarLectura();

        humedad.mostrarInformacion();
        humedad.actualizarLectura(70);
        humedad.mostrarLectura();




    }
}
