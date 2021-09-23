/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentovesp;

/**
 *
 * @author Usuario
 */
public class Proprio extends Carro
{
    private double valorCompra;
    private String dataCompra;

    public Proprio(int cod, String placa, String modelo, int ano, 
                   double valorCompra, String dataCompra) 
    {
        super(cod, placa, modelo, ano);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }
    
    // Getters e setters

    public double getValorCompra() 
    {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) 
    {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() 
    {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) 
    {
        this.dataCompra = dataCompra;
    }
    
    ////////////////////////
    
    @Override
    public boolean oferta(double valor)
    {
        return valor >= valorCompra*1.1;
    }
            
    @Override
    public void imprimeDados()
    {
        super.imprimeDados();
        System.out.println(
           "Valor de compra: " + valorCompra + "\n" +
           "Data de compra: " + dataCompra);
    }
    
} //////////////////////////////////////////////
