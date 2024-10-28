/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac2poo;

/**
 *
 * @author alenis
 */
import java.util.ArrayList;

public class Locadora {
    private String nome;                     // Nome da locadora
    private ArrayList<VeiculoBase> veiculos; // Lista de veículos

    public Locadora(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    // Método para adicionar um veículo à locadora
    public void adicionarVeiculo(VeiculoBase veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado: " + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    // Método para remover um veículo da locadora
    public void removerVeiculo(VeiculoBase veiculo) {
        if (veiculos.remove(veiculo)) {
            System.out.println("Veículo removido: " + veiculo.getMarca() + " " + veiculo.getModelo());
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    // Método para calcular a receita total da locadora
    public double calcularReceitaTotal() {
        double receitaTotal = 0;
        for (VeiculoBase veiculo : veiculos) {
            receitaTotal += veiculo.calcularPreco();
        }
        return receitaTotal;
    }

    // Método para imprimir os preços dos veículos
    public void imprimirPrecosVeiculos() {
        for (VeiculoBase veiculo : veiculos) {
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Preço de locação: " + veiculo.calcularPreco());
        }
    }
}

