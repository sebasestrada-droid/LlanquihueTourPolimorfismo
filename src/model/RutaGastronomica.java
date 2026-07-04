package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroParadas;

    public RutaGastronomica(String nombre,
                            double duracionHoras,
                            int numeroParadas) {

        super(nombre, duracionHoras);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nTipo de servicio: Ruta Gastronómica" +
                "\nNúmero de paradas: " + numeroParadas;

    }

    @Override
    public String mostrarInformacion() {

        return "====================================\n"
                + toString()
                + "\n====================================";

    }

}