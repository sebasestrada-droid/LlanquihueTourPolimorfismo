package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        cargarServicios();

    }

    private void cargarServicios() {

        servicios.add(new RutaGastronomica(
                "Ruta Gastronómica Puerto Varas",
                4,
                6));

        servicios.add(new RutaGastronomica(
                "Ruta Sabores del Sur",
                5,
                8));

        servicios.add(new PaseoLacustre(
                "Paseo Lago Llanquihue",
                3,
                "Catamarán"));

        servicios.add(new PaseoLacustre(
                "Navegación Río Maullín",
                2.5,
                "Lancha"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial Alemán",
                2,
                "Frutillar"));

    }

    public List<ServicioTuristico> obtenerServicios() {

        return servicios;

    }

}