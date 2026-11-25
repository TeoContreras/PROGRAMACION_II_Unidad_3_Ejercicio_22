public class Camion extends Vehiculo {
    private double capacidadCarga;
    public Camion(String patente, String marca, int anio, double capacidadCarga) {
        super(patente, marca, anio); this.capacidadCarga = capacidadCarga;
    }
    @Override
    public void mostrarDatos() { super.mostrarDatos(); System.out.println("Carga: " + capacidadCarga + " toneladas"); }
}