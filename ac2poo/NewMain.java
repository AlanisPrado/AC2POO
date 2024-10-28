/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac2poo;

/**
 *
 * @author alenis
 */
public class NewMain {

    public static void main(String[] args) {
        // Criar a locadora
        Locadora locadora = new Locadora("Locadora XYZ");

        // Criar veículos
        Carro carro = new Carro("Ford", "Fiesta", 100.0);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 200, 10); // taxaCarga de 10%
        Motocicleta motocicleta = new Motocicleta("Honda", "CG", 50, 20); // taxaSeguro de 20

        // Adicionar veículos à locadora
        locadora.adicionarVeiculo(carro);
        locadora.adicionarVeiculo(caminhao);
        locadora.adicionarVeiculo(motocicleta);

        // Imprimir preços dos veículos
        locadora.imprimirPrecosVeiculos();

        // Calcular receita total
        double receitaTotal = locadora.calcularReceitaTotal();
        System.out.println("Receita total da locadora: " + receitaTotal);
    }
}

