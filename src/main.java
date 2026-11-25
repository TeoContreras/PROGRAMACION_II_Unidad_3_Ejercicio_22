public class main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new AutoParticular("AA123BB", "Toyota", 2022, 4);
        vehiculos[1] = new Camion("AC456CD", "Mercedes", 2020, 12);
        vehiculos[2] = new Motocicleta("AD789EF", "Honda", 2023, 150);
        for (int i = 0; i < vehiculos.length; i++) { vehiculos[i].encender(); vehiculos[i].mostrarDatos(); }
    }
}