package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        List<ServicioTuristico> servicios =
                gestor.obtenerServicios();

        System.out.println("======================================");
        System.out.println("      LLANQUIHUE TOUR");
        System.out.println("  SERVICIOS TURÍSTICOS DISPONIBLES");
        System.out.println("======================================\n");

        for (ServicioTuristico servicio : servicios) {

            System.out.println(servicio.mostrarInformacion());

        }

        System.out.println("\n======================================");
        System.out.println("Cantidad de servicios: "
                + servicios.size());
        System.out.println("======================================");

    }

}