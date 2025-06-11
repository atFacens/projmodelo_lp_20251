package br.facens;

import br.facens.dao.VehicleDAO;
import br.facens.models.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(0, "Honda", "Civic", 2001);

        boolean inserted = VehicleDAO.create(vehicle);

        if(inserted) {
            System.out.println("Veículo cadastrado com sucesso");
        } else {
            System.out.println("Falha no cadastro");

        }
    }
}