/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2poo;

/**
 *
 * @author alenis
 */
// Classe abstrata VeiculoBase
public abstract class VeiculoBase {
    protected String marca;       // Marca do veículo
    protected String modelo;      // Modelo do veículo
    protected double precoBase;   // Preço base do veículo

    // Construtor da classe VeiculoBase
    public VeiculoBase(String marca, String modelo, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract double calcularPreco();

    // Sobrecarga do método calcularPreco que aceita um desconto
    public double calcularPreco(double desconto) {
        return calcularPreco() - desconto;
    }

    // Métodos getters para acessar os atributos protegidos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}

