package br.facens.models;

public class Veiculos {
    private int cod;
    private String marca;
    private String modelo;
    private int ano;

    public Veiculos() {
    }

    public Veiculos(int cod, String marca, String modelo, int ano) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
