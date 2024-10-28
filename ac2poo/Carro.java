/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2poo;

/**
 *
 * @author alenis
 */
// Classe Carro que estende VeiculoBase
class Carro extends VeiculoBase {
    public Carro(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularPreco() {
        // Preço de locação = precoBase
        return precoBase;
    }
}

// Classe Caminhão que estende VeiculoBase e implementa Beneficios
class Caminhao extends VeiculoBase implements Beneficios {
    private double taxaCarga; // Taxa de carga em percentual

    public Caminhao(String marca, String modelo, double precoBase, double taxaCarga) {
        super(marca, modelo, precoBase);
        this.taxaCarga = taxaCarga;
    }

    @Override
    public double calcularPreco() {
        // Preço de locação = precoBase + (precoBase * taxaCarga)
        return precoBase + (precoBase * taxaCarga / 100);
    }

    @Override
    public double calcularDesconto(double percentual) {
        return calcularPreco() * percentual / 100;
    }
}

// Classe Motocicleta que estende VeiculoBase e implementa Beneficios
class Motocicleta extends VeiculoBase implements Beneficios {
    private double taxaSeguro; // Taxa de seguro fixa

    public Motocicleta(String marca, String modelo, double precoBase, double taxaSeguro) {
        super(marca, modelo, precoBase);
        this.taxaSeguro = taxaSeguro;
    }

    @Override
    public double calcularPreco() {
        // Preço de locação = precoBase + taxaSeguro
        return precoBase + taxaSeguro;
    }

    @Override
    public double calcularDesconto(double percentual) {
        return calcularPreco() * percentual / 100;
    }
}

