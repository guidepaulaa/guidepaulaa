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
public class Consignado extends Carro
{
    private String nomeProp;
    private double valorProp;

    public Consignado(int cod, String placa, String modelo, int ano, 
                      String nomeProp, double valorProp) 
    {
        super(cod, placa, modelo, ano);
        this.nomeProp = nomeProp;
        this.valorProp = valorProp;
    }
    
    // Getters e setters

    public String getNomeProp() 
    {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) 
    {
        this.nomeProp = nomeProp;
    }

    public double getValorProp() 
    {
        return valorProp;
    }

    public void setValorProp(double valorProp) 
    {
        this.valorProp = valorProp;
    }
    
    // Métodos
    @Override
    public boolean oferta(double valor)
    {
        return valor >= valorProp*1.05;
    }
            
    @Override
    public void imprimeDados()
    {
        super.imprimeDados();
        System.out.println(
           "Nome do proprietário: " + nomeProp + "\n" +
           "Valor para o proprietário: " + valorProp);
    }
    

} //////////////////////////////////////////////////

