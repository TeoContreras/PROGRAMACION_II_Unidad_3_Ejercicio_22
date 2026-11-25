public class Vehiculo {
    protected String patente, marca;
    protected int anio;
    public Vehiculo(String patente, String marca, int anio) {
        this.patente = patente; this.marca = marca; this.anio = anio;
    }
    public void encender() { System.out.println("El vehiculo esta encendido."); }
    public void mostrarDatos() {
        System.out.println("Patente: " + patente + " - Marca: " + marca + " - Anio: " + anio);
    }
}