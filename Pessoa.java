/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancant;

/**
 *
 * @author Usuario
 */
public abstract class Pessoa 
// Ancestral
{
    private String nome, rg;

    public Pessoa(String nome, String rg) 
    {
        this.nome = nome;
        this.rg = rg;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }
    
    @Override
    public String toString()
    {
        return nome + " " + rg;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
}
