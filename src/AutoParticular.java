public class AutoParticular extends Vehiculo {
    private int cantidadPuertas;
    public AutoParticular(String patente, String marca, int anio, int cantidadPuertas) {
        super(patente, marca, anio); this.cantidadPuertas = cantidadPuertas;
    }
    @Override
    public void mostrarDatos() { super.mostrarDatos(); System.out.println("Puertas: " + cantidadPuertas); }
}