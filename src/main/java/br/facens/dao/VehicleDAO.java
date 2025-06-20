package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.facens.models.Vehicle;

public class VehicleDAO {
    private static final String url = "jdbc:mysql://localhost:3306/bd_veiculos_facens";
    private static final String username = "profFacens"; // root
    private static final String password = "aula"; // root

    public static boolean create(Vehicle vehicles) {
        String sql = "insert into vehicles (model, brand, manufacture_year) values(?,?,?)";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setString(1, vehicles.getModel());
            preparedStatement.setString(2, vehicles.getBrand());
            preparedStatement.setInt(3, vehicles.getManufactureYear());

            int result = preparedStatement.executeUpdate();

            return (result > 0);
        } catch (SQLException e) {
            System.out.println("Erro na inserção:" + e.getMessage());
            return false;
        }
    }

    public static Vehicle search(int cod) {
        String sql = "select * from vehicles where id = ?;";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

            preparedStatement.setInt(1, cod);

            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                String brand = result.getString("brand");
                String model = result.getString("model");
                int year = result.getInt("manufacture_year");

                Vehicle vehicle = new Vehicle(cod, brand, model, year);

                return vehicle;
            }

            return null;

        } catch (SQLException e) {
            System.out.println("Erro na inserção:" + e.getMessage());
            return null;
        }
    }

    public static boolean delete(int cod) {
        String sql = "delete from vehicles where id = ?;";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

            preparedStatement.setInt(1, cod);

            int result = preparedStatement.executeUpdate();

            return (result > 0);
        } catch (SQLException e) {
            System.out.println("Erro na inserção:" + e.getMessage());
            return false;
        }
    }
}
