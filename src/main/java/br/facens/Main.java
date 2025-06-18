package br.facens;

import br.facens.dao.VehicleDAO;

public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(0, "Honda", "Civic", 2001);
        // Vehicle vehicle = new Vehicle(0, "Honda", "Fit", 2002);

        // boolean inserted = VehicleDAO.create(vehicle);

        // if(inserted) {
        //     System.out.println("Veículo cadastrado com sucesso");
        // } else {
        //     System.out.println("Falha no cadastro");

        // }

        boolean deleted = VehicleDAO.delete(1);

        if(deleted) {
            System.out.println("Apagado com sucesso!");
        }else {
            System.out.println("Não foi possível apagar");
        }
    }
}