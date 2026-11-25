public class Motocicleta extends Vehiculo {
    private int cilindrada;
    public Motocicleta(String patente, String marca, int anio, int cilindrada) {
        super(patente, marca, anio); this.cilindrada = cilindrada;
    }
    @Override
    public void mostrarDatos() { super.mostrarDatos(); System.out.println("Cilindrada: " + cilindrada + " cc"); }
}