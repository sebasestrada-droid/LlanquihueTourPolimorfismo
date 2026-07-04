package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre,
                             double duracionHoras,
                             String lugarHistorico) {

        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nTipo de servicio: Excursión Cultural" +
                "\nLugar histórico: " + lugarHistorico;

    }

    @Override
    public String mostrarInformacion() {

        return "====================================\n"
                + toString()
                + "\n====================================";

    }

}