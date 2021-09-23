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
public abstract class Carro 
{
    private int cod;
    private String placa;
    private String modelo;
    private int ano;
    private boolean disp;
    private String vendedor;

    public Carro(int cod, String placa, String modelo, int ano) 
    {
        this.cod = cod;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        disp= true;
        vendedor= "";
    }
    
    // getters
    public int getCod() 
    {
        return cod;
    }

    public String getPlaca() 
    {
        return placa;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public int getAno() 
    {
        return ano;
    }

    public String getVendedor() 
    {
        return vendedor;
    }
    
    // Setters
    public void setCod(int cod) 
    {
        this.cod = cod;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }
    
    // Métodos
    public boolean disponivel()    
    {
        return disp;
    }
    
    public abstract boolean oferta(double valor);
    
    public boolean venderCarro(String vendedor, double valorVenda)
    {
        if(!disp) return false;
        if(!oferta(valorVenda)) return false;
        disp= false;
        this.vendedor= vendedor;
        return true;
    }
    
    public void imprimeDados()
    {
        System.out.println("\n" +
            "Código: " + cod + "\n" +
            "Placa: " + placa + "\n" +
            "Modelo: " + modelo + "\n" +
            "Ano: " + ano + "\n" +
            "Disponível para venda: " + (disp?"Sim":"Não"));
        if(!disp) System.out.println("Vendedor: " + vendedor);
    }
    
} ///////////////////////////////////////////////

